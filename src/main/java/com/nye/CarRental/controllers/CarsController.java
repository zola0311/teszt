package com.nye.CarRental.controllers;

import com.nye.CarRental.models.CarsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class CarsController {

    List<CarsModel> cars = new ArrayList<>();
    boolean firstStart = false;

    @GetMapping("/")
    public String showIndex(Model model) {
        if(!firstStart) {
            cars.add(new CarsModel(UUID.randomUUID().toString(), "Audi", "A6", "Benzin", "265678", "Fehér", "Nem"));
            cars.add(new CarsModel(UUID.randomUUID().toString(), "Toyota", "Hilux", "Dízel", "476598", "Barna", "Nem"));
            firstStart = true;
        }
        model.addAttribute("cars", cars);
        return "index";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("car", new CarsModel());
        model.addAttribute("cars", cars);
        return "addNewCar";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute CarsModel car, Model model) {
        model.addAttribute("cars", cars);
        car.setId(UUID.randomUUID().toString());
        cars.add(car);
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable(value = "id") String id, Model model) {
        model.addAttribute("cars", cars);
        for(CarsModel car : cars) {
            if (car.getId().equals(id)) {
                model.addAttribute("car", car);
            }
        }
        return "editCar";
    }

    @PostMapping("/edit")
    public String postEdit(@ModelAttribute CarsModel car, Model model) {
        model.addAttribute("cars", cars);
        for(CarsModel currentCar : cars) {
            if (currentCar.getId().equals(car.getId())) {
                currentCar.setManufacturer(car.getManufacturer());
                currentCar.setType(car.getType());
                currentCar.setFuelType(car.getFuelType());
                currentCar.setOdoMeter(car.getOdoMeter());
                currentCar.setColor(car.getColor());
                currentCar.setIsLending(car.getIsLending());
            }
        }
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable(value = "id") String id, Model model) {
        model.addAttribute("cars", cars);
        cars.removeIf(car -> car.getId().equals(id));
        return "index";
    }
}

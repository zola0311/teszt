package com.nye.CarRental.models;

import java.util.Objects;

public class CarsModel {

    private String Id;
    private String Manufacturer;
    private String Type;
    private String FuelType;
    private String OdoMeter;
    private String Color;
    private String IsLending;

    public CarsModel() {

    }

    public CarsModel(String Id, String Manufacturer, String Type, String FuelType, String OdoMeter, String Color, String IsLending) {
        this.Id = Id;
        this.Manufacturer = Manufacturer;
        this.Type = Type;
        this.FuelType = FuelType;
        this.OdoMeter = OdoMeter;
        this.Color = Color;
        this.IsLending = IsLending;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public String getOdoMeter() {
        return OdoMeter;
    }

    public void setOdoMeter(String odoMeter) {
        OdoMeter = odoMeter;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getIsLending() {
        return IsLending;
    }

    public void setIsLending(String isLending) {
        IsLending = isLending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarsModel)) return false;
        CarsModel carsModel = (CarsModel) o;
        return Id.equals(carsModel.Id) && Manufacturer.equals(carsModel.Manufacturer) && Type.equals(carsModel.Type) && FuelType.equals(carsModel.FuelType) && OdoMeter.equals(carsModel.OdoMeter) && Color.equals(carsModel.Color) && IsLending.equals(carsModel.IsLending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Manufacturer, Type, FuelType, OdoMeter, Color, IsLending);
    }

    @Override
    public String toString() {
        return "CarsModel{" +
                "Id='" + Id + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Type='" + Type + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", OdoMeter='" + OdoMeter + '\'' +
                ", Color='" + Color + '\'' +
                ", IsLending='" + IsLending + '\'' +
                '}';
    }
}

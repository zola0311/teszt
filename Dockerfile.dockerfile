FROM openjdk:11-jdk-alpine3.14

COPY "./target/CarRental.jar" "/application/CarRental.jar"

CMD ["java", "-jar", "/application/CarRental.jar"]
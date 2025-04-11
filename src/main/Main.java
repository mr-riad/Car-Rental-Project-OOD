package main;

import model.Car;
import service.CarRentalSystem;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        rentalSystem.addCar(new Car("C001", "Toyota", "Camry", 1160.0));
        rentalSystem.addCar(new Car("C002", "Honda", "Accord", 1770.0));
        rentalSystem.addCar(new Car("C003", "Mahindra", "Thar", 2150.0));
        rentalSystem.addCar(new Car("C004", "Hyundai", "Creta", 1880.0));
        rentalSystem.addCar(new Car("C005", "Ford", "Mustang", 2200.0));
        rentalSystem.addCar(new Car("C006", "Suzuki", "Swift", 1150.0));
        rentalSystem.addCar(new Car("C007", "BMW", "X5", 5250.0));

        rentalSystem.menu();
    }
}

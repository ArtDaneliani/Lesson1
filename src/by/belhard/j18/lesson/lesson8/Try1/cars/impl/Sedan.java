package by.belhard.j18.lesson.lesson8.Try1.cars.impl;

import by.belhard.j18.lesson.lesson8.Try1.cars.Car;
import by.belhard.j18.lesson.lesson8.Try1.cars.FuelSystem;
import by.belhard.j18.lesson.lesson8.Try1.cars.FuelType;
import by.belhard.j18.lesson.lesson8.Try1.cars.WheelType;
import by.belhard.j18.lesson.lesson8.Try1.exceptions.InvalidFuelParameterException;

import java.util.Arrays;
import java.util.List;

public class Sedan extends Car {

    private static final List<FuelType> possibleFuelTypes =
            Arrays.asList(FuelType.AI92, FuelType.AI98);

    public Sedan(String title, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.SMALL, wheelsOkState, checkFuel(fuelSystem, possibleFuelTypes));
    }

}
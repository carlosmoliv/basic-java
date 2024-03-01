package org.example.domain.car;

import java.util.*;

public class CarRepositoryImpl implements CarRepository {
    private final Set<Car> cars;

    public CarRepositoryImpl() {
        this.cars = new HashSet<>();
    }

    @Override
    public void save(Car car) {
        this.cars.add(car);
    }

    @Override
    public Car[] findAll() {
        return cars.toArray(new Car[0]);
    }

    @Override
    public Car[] findByType(CarType type) {
        return cars.stream()
                .filter(car -> car.getType() == type).distinct().toArray(Car[]::new);
    }
}

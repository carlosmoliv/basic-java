package org.example.car;

public interface CarRepository {
    public void save(Car car);
    public Car[] findAll();
    public Car[] findByType(CarType type);
}

package org.example.booking;

import org.example.car.Car;

import java.util.UUID;

public class Booking {
    private UUID userId;
    private Car car;

    public Booking(UUID userId, Car car) {
        this.userId = userId;
        this.car = car;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userId=" + userId +
                ", car=" + car +
                '}';
    }
}

package org.example.car;

public class Car {
    private String description;
    private CarType type;

    public Car(String description, CarType type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String brand) {
        this.description = brand;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

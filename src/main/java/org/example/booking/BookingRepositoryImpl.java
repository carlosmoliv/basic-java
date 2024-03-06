package org.example.booking;

import org.example.car.Car;

import java.util.*;
import java.util.stream.Collectors;

public class BookingRepositoryImpl implements BookingRepository {
    private final Map<UUID, List<Car>> bookings;

    public BookingRepositoryImpl() {
        this.bookings = new HashMap<>();
    }

    @Override
    public void save(Booking booking) {
        List<Car> userCars = bookings.computeIfAbsent(booking.getUserId(), k -> new ArrayList<>());
        userCars.add(booking.getCar());
    }

    @Override
    public List<Car> findByUserId(UUID userId) {
        return this.bookings.get(userId);
    }

    @Override
    public List<Booking> findAll() {
        return bookings.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(car -> new Booking(entry.getKey(), car)))
                .collect(Collectors.toList());
    }
}

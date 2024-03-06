package org.example.booking;
import org.example.car.Car;

import java.util.List;
import java.util.UUID;

public interface BookingRepository {
    public void save(Booking booking);
    public List<Car> findByUserId(UUID userId);
    public List<Booking> findAll();
}

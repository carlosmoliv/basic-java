package org.example.domain.booking;
import org.example.domain.car.Car;

import java.util.List;
import java.util.UUID;

public interface BookingRepository {
    public void save(Booking booking);
    public List<Car> findByUserId(UUID userId);
    public List<Booking> findAll();
}

package org.example.domain.booking;

import org.example.domain.car.Car;

import java.util.List;
import java.util.UUID;

public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void bookCar(Booking booking) {
        this.bookingRepository.save(booking);
    }

    public Car[] getUserBookedCars(UUID userId) {
       return this.bookingRepository.findByUserId(userId).toArray(new Car[0]);
    }

    public List<Booking> getAllBookings() {
        return this.bookingRepository.findAll();
    }
}

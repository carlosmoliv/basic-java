package org.example;

import org.example.domain.booking.Booking;
import org.example.domain.booking.BookingRepositoryImpl;
import org.example.domain.booking.BookingService;
import org.example.domain.car.Car;
import org.example.domain.car.CarRepository;
import org.example.domain.car.CarRepositoryImpl;
import org.example.domain.car.CarType;
import org.example.domain.user.User;
import org.example.domain.user.UserRepository;
import org.example.domain.user.UserRepositoryImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Car
        Car car = new Car("Tesla", CarType.ELECTRIC);
        Car car2 = new Car("BMW", CarType.SPORTS_CAR);
        CarRepository carRepo = new CarRepositoryImpl();
        carRepo.save(car);
        carRepo.save(car2);
        System.out.println(Arrays.toString(carRepo.findAll()));
        System.out.println(Arrays.toString(carRepo.findByType(CarType.ELECTRIC)));

        // User
        User user = new User("Chris Redfield", "chris@gmail.com", "12345");
        User user2 = new User("Leon S Kennedy", "leon@gmail.com", "12345");
        UserRepository userRepo = new UserRepositoryImpl();
        userRepo.save(user);
        userRepo.save(user2);
        System.out.println(Arrays.toString(userRepo.findAll()));

        // Booking
        Booking firstBooking = new Booking(user.getId(), car);
        Booking secondBooking = new Booking(user.getId(), car2);
        BookingService bookingService = new BookingService(new BookingRepositoryImpl());
        bookingService.bookCar(firstBooking);
        bookingService.bookCar(secondBooking);
        System.out.print("Bookings: ");

        List<Booking> userBookings = bookingService.getAllBookings();
        for (Booking booking : userBookings) {
            System.out.print(booking + ", ");
        }
        System.out.println();
    }
}
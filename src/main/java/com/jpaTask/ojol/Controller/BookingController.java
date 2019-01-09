package com.jpaTask.ojol.Controller;

import com.jpaTask.ojol.Service.BookingService;
import com.jpaTask.ojol.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking/{id}")
    public Booking getBookingById(@PathVariable BigInteger id)
    {
        return bookingService.findById(id);
    }

    @GetMapping("/booking/")
    public List<Booking> getAllBooking()
    {
        return bookingService.findAll();
    }

    @PostMapping("/booking/")
    public Booking addBooking(@Valid @ModelAttribute Booking booking)
    {
        return bookingService.add(booking);
    }

    @PutMapping("/booking/cancel/{id}")
    public void cancelBooking(@PathVariable BigInteger id)
    {
        bookingService.cancel(id);
    }

    @PostMapping("/booking/scheduled")
    public Booking scheduledBooking(@Valid Date date, @Valid @ModelAttribute Booking booking)
    {
        return bookingService.addScheduled(date,booking);
    }

    @PutMapping("/booking/{id}")
    public void updateBooking(@PathVariable BigInteger id, @Valid @ModelAttribute Booking booking)
    {
        bookingService.update(id,booking);
    }
}

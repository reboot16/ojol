package com.jpaTask.ojol.Service.impl;

import com.jpaTask.ojol.Repository.BookingRepository;
import com.jpaTask.ojol.Service.BookingService;
import com.jpaTask.ojol.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking findById(BigInteger id) {
        return bookingRepository.findById(id);
    }

    @Override
    public List<Booking> findAll() {
        List<Booking> bookings = bookingRepository.findAll();
        return bookings;
    }

    @Override
    public Booking add(Booking booking) {
        booking.setStatus("Request");
        return bookingRepository.save(booking);
    }

    @Override
    public void update(BigInteger id, Booking booking) {
        Booking booking1 = bookingRepository.findById(id);
        if(booking1 != null)
            bookingRepository.save(booking);
    }

    @Override
    public void cancel(BigInteger id) {
        Booking booking = bookingRepository.findById(id);
        if (booking != null){
            booking.setStatus("Canceled");
            bookingRepository.save(booking);
        }
    }

    @Override
    public Booking addScheduled(Date date, Booking booking) {
        booking.setTime(date);
        return add(booking);
    }
}

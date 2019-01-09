package com.jpaTask.ojol.Service;

import com.jpaTask.ojol.model.Booking;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface BookingService {
    Booking findById(BigInteger id);
    List<Booking> findAll();
    Booking add(Booking booking);
    void update(BigInteger id ,Booking booking);
    void cancel(BigInteger id);
    Booking addScheduled(Date date, Booking booking);
}

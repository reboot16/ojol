package com.jpaTask.ojol.Repository;

import com.jpaTask.ojol.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface BookingRepository extends JpaRepository<Booking, String> {
    Booking findById(BigInteger id);
}

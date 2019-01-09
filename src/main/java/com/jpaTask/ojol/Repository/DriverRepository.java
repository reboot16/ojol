package com.jpaTask.ojol.Repository;

import com.jpaTask.ojol.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DriverRepository extends JpaRepository<Driver, String> {
    Driver findById(BigInteger id);
    boolean existsById(BigInteger id);
}

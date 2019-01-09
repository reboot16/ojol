package com.jpaTask.ojol.Service;

import com.jpaTask.ojol.model.Driver;

import java.math.BigInteger;
import java.util.List;

public interface DriverService {

    Driver findOne(BigInteger id);
    List<Driver> finAllDriver();
    Driver addDriver(Driver driver);
    void updateDriver(BigInteger id,Driver driver);
}

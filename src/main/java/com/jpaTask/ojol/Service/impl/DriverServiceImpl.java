package com.jpaTask.ojol.Service.impl;

import com.jpaTask.ojol.Repository.DriverRepository;
import com.jpaTask.ojol.Service.DriverService;
import com.jpaTask.ojol.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepository driverRepository;

    @Override
    public Driver findOne(BigInteger id) {
        return driverRepository.findById(id);
    }

    @Override
    public List<Driver> finAllDriver() {
        List<Driver> drivers = driverRepository.findAll();
        return drivers;
    }

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public void updateDriver(BigInteger id, Driver driver) {
        Driver driver1 = driverRepository.findById(id);
        if(driver1 != null)
            driverRepository.save(driver);
    }
}

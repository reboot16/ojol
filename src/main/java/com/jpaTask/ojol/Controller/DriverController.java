package com.jpaTask.ojol.Controller;

import com.jpaTask.ojol.Service.DriverService;
import com.jpaTask.ojol.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping("/driver/{id}")
    public Driver getDriverById(@PathVariable(name = "id") BigInteger id)
    {
        return driverService.findOne(id);
    }

    @GetMapping("/driver")
    public List<Driver> getAllDriver()
    {
        return driverService.finAllDriver();
    }

    @PostMapping("/driver")
    public Driver addDriver(@Valid @RequestBody Driver driver)
    {
        return driverService.addDriver(driver);
    }

    @PutMapping("/driver/{id}")
    public void updateDriver(@PathVariable BigInteger id, @Valid @ModelAttribute Driver driver)
    {
        driverService.updateDriver(id,driver);
    }

}

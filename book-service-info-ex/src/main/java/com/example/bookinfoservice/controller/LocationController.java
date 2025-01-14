package com.example.bookinfoservice.controller;
import com.example.bookinfoservice.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookinfoservice.repository.LocationRepository;

import java.util.List;

@RestController
public class LocationController {
    //location
    @Autowired
    LocationRepository locationRepository;
    @GetMapping("/locations/{locationId}")
    public Location getLocationById(@PathVariable int locationId){
        return locationRepository.findByLocationId(locationId);
    }
    @GetMapping("/locations/")
    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }

    //Employee

}


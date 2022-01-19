package com.example.ciapi.controller;
import com.example.ciapi.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfluencerController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/locations/all")
    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }
}
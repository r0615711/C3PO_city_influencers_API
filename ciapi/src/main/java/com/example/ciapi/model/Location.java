package com.example.ciapi.model;

import javax.persistence.*;

@Entity
public class Location {

    @locationId
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int locationId;

    private String name;

    public Influencer() {
    }

    public Location(int locationId, String name) {
        this.locationId = locationId;
        this.name = name;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
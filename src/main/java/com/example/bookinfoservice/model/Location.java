package com.example.bookinfoservice.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int locationId;
    private String name;

    /*public Location(int locationId, String name) {
        this.locationId = locationId;
        this.name = name;
    }*/

    public Location() {
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

package com.example.bookinfoservice.repository;

import com.example.bookinfoservice.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Location findByLocationId(int locationId);
}

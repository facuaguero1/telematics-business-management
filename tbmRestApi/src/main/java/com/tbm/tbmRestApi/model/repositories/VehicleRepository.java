package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleRepository")
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}

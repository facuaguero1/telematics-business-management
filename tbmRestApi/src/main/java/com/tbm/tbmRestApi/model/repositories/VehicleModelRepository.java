package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleModelRepository")
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer>{
}

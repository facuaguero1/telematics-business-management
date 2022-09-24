package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.VehicleBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleBrandRepository")
public interface VehicleBrandRepository extends JpaRepository<VehicleBrand, Integer> {
}

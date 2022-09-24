package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.AvlBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AvlBrandRepository")
public interface AvlBrandRepository extends JpaRepository<AvlBrand, Integer>{
}

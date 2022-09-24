package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.MobileOperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MobileOperatorRepository")
public interface MobileOperatorRepository extends JpaRepository<MobileOperator, Integer>{
}

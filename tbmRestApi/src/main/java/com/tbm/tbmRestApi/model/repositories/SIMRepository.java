package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.SIM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("SIMRepository")
public interface SIMRepository extends JpaRepository<SIM, Integer>{
}

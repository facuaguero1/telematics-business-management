package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.AvlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AvlModelRepository")
public interface AvlModelRepository extends JpaRepository<AvlModel, Integer>{
}

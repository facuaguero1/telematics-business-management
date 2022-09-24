package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.AvlState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* No name was assigned to this repo because no end user should be able to create or modify
    in any way an AVLState instance. */
@Repository
public interface AvlStateRepository extends JpaRepository<AvlState, Integer>{
}

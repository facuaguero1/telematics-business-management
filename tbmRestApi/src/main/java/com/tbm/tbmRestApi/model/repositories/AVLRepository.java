package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.AVL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AVLRepository")
public interface AVLRepository extends JpaRepository<AVL, Integer>{
}

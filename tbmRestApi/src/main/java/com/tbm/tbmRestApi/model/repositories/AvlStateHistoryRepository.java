package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.AvlStateHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AvlStateHistoryRepository")
public interface AvlStateHistoryRepository extends JpaRepository<AvlStateHistory, Integer>{
}

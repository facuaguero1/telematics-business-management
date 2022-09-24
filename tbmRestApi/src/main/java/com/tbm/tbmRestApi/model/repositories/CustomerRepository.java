package com.tbm.tbmRestApi.model.repositories;

import com.tbm.tbmRestApi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}

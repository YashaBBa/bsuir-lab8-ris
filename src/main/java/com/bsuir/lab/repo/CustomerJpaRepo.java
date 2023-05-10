package com.bsuir.lab.repo;

import com.bsuir.lab.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerJpaRepo extends JpaRepository<Customer,Integer> {
    List<Customer> findAll();
}

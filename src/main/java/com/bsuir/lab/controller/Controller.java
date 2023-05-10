package com.bsuir.lab.controller;

import com.bsuir.lab.entity.Customer;
import com.bsuir.lab.repo.CustomerJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@RequiredArgsConstructor
public class Controller {
    private final CustomerJpaRepo customerJpaRepo;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerJpaRepo.findAll();

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public ResponseEntity<String> addNewCustomer(Customer customer) {
        customerJpaRepo.save(customer);
        return ResponseEntity.ok("Customer was created");
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/remove/{id}")
    public ResponseEntity<String> removeCustomer(@PathVariable Integer id) {
        customerJpaRepo.deleteById(id);
        return ResponseEntity.ok("Customer was removed");
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable Integer id, Customer customer) {
        customer.setId(id);
        customerJpaRepo.save(customer);

        return ResponseEntity.ok("Customer was updated");
    }

}

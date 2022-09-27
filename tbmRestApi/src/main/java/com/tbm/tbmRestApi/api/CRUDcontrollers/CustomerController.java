package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.Customer;
import com.tbm.tbmRestApi.model.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RequestMapping("api/customer")
@RestController
public class CustomerController {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

    @GetMapping("all")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping
    public Optional<Customer> getCustomer(@RequestParam(name = "id") Integer id) {
        return customerRepository.findById(id);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CasoLaboratorio3.web;

import com.example.CasoLaboratorio3.domain.Customer;
import com.example.CasoLaboratorio3.service.CustomerService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorInicio {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        var customers = customerService.listarCustomers();
        return customers;
    }
    
    @PostMapping("/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.guardar(customer);
    }
    
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        Customer customer = new Customer();
        customer.setId(id);
        customerService.eliminar(customer);
    }
    
    @GetMapping("/customers/{id}")
    public Customer getCustomerId(@PathVariable("id") Long id) {
        Customer customer = new Customer();
        customer.setId(id);
        return customerService.encontrarCustomer(customer);
    }
    
}

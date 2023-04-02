/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CasoLaboratorio3.service;

import com.example.CasoLaboratorio3.dao.CustomerDao;
import com.example.CasoLaboratorio3.domain.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Customer> listarCustomers() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public void eliminar(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public Customer encontrarCustomer(Customer customer) {
        return customerDao.findById(customer.getId()).orElse(null);
    }
    
    
}

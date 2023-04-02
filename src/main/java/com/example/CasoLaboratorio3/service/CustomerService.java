/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CasoLaboratorio3.service;

import com.example.CasoLaboratorio3.domain.Customer;
import java.util.List;

public interface CustomerService {
    public List<Customer> listarCustomers();
    
    public void guardar(Customer customer);
    public void eliminar(Customer customer);
    public Customer encontrarCustomer(Customer customer);
}

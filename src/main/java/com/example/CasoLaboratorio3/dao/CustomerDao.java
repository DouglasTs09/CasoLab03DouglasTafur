/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CasoLaboratorio3.dao;

import com.example.CasoLaboratorio3.domain.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerDao extends CrudRepository<Customer, Long>{

}

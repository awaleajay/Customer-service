package com.example.costomerDB.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.costomerDB.CustomerDBController.CustomerDBController;
import com.example.costomerDB.model.CostomerDB;

public interface CustomerRepository extends CrudRepository<CostomerDB, Integer> {

}

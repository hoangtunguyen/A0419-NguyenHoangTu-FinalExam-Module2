package com.example.finalexam.repository;

import com.example.finalexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("select  r from #{#entityName} r")
    List<Employee> findAll();

    List<Employee> findAllByFullNameContainsOrCodeContains(String name1,String name);

}

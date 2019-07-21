package com.example.finalexam.service;

import com.example.finalexam.model.Employee;
import com.example.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> employees(){
        return  employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }
    public Employee getEmpoyyeeById(int id){
       Employee employee= employeeRepository.findById(id).get();
       return employee;
    }
    public void deleteById(int id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> searchEmployee(String name){
        List<Employee> lists= employeeRepository.findAllByFullNameContainsOrCodeContains(name,name);
        return lists;
    }
}

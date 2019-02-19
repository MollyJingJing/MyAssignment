package com.example.demo.entity;

import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeGateway {
    @Autowired
    EmployeeMapper employeeMapper;

    public void save(Employee employee){
        employeeMapper.insert(employee);
    }

    public Employee findById(Long id){
        return employeeMapper.selectById(id);
    }

    public void delete(Long id){
        employeeMapper.deleteById(id);
    }

    public List<Employee> findAll(){
        return employeeMapper.findAll();
    }

    public Long count(){
        return employeeMapper.countAll();
    }

    public List<Employee> find(String email,Double salary){
        return employeeMapper.findByEmailAndsalary(email,salary);
    }

}

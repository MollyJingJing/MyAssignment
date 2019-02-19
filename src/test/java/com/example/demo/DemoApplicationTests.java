package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeGateway;
import com.example.demo.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	EmployeeGateway employeeGateway;

	@Test
	public void contextLoads() {

		Employee employee = new Employee();
		employee.setAge(12L);
		employee.setEmail("b");
		employee.setGender("男");
		employee.setName("test");
		employee.setSalary(120.0);
		employeeGateway.count();
		employeeGateway.delete(1L);
		employeeGateway.findAll();
		employeeGateway.find("a",1000.0);
		employeeGateway.save(employee);
		employeeGateway.findById(1L);
	}

}


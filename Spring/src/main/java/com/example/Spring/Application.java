package com.example.Spring;

import com.example.Spring.model.Employee;
import com.example.Spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	public  void run(String... args) throws  Exception{
		Employee employee=new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("F");
		employee.setEmailId("ramesh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee.setFirstName("ABC");
		employee.setLastName("D");
		employee.setEmailId("ABC@gmail.com");
		employeeRepository.save(employee1);

	}
}

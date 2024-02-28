package com.example.Spring.repository;
import org.springframework.stereotype.Repository;
import com.example.Spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

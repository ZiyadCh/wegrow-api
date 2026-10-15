package ma.wegrow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ma.wegrow.model.Employee;
import ma.wegrow.repository.EmployeeRepository;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  @Transactional
  public void createEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

  public List<Employee> ListEmployee() {
    return employeeRepository.findAll();
  }

}

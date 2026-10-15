package ma.wegrow.service;

import ma.wegrow.model.Employee;
import ma.wegrow.repository.EmployeeRepository;

/**
 * EmployeeService
 */
public class EmployeeService {
  private final EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public void createEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

}

package ma.wegrow.service;

import jakarta.transaction.Transactional;
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

  @Transactional
  public void createEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

}

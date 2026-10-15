package ma.wegrow.service;

import java.util.List;
import java.util.Optional;

import ma.wegrow.model.Departement;
import ma.wegrow.model.Employee;
import ma.wegrow.repository.DepartementRepository;
import ma.wegrow.repository.EmployeeRepository;

/**
 * EmployeeService
 */
public class EmployeeService {
  private final EmployeeRepository employeeRepository;
  private final DepartementRepository departementRepository;

  public EmployeeService(EmployeeRepository employeeRepository, DepartementRepository departementRepository) {
    this.employeeRepository = employeeRepository;
    this.departementRepository = departementRepository;
  }

  public void createEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

  public void addEmployeeToDepartement(Long departementId, Employee employee) {
    Optional<Departement> optionalDepartement = departementRepository.findById(departementId);
    if (optionalDepartement.isEmpty()) {
      throw new IllegalArgumentException("Departement non trouve!!");
    }
    employee.setDepartement(optionalDepartement.get());
    employeeRepository.save(employee);
  }

  public List<Employee> listEmployeesByDepartement(Long departementId) {
    return employeeRepository.findByDepartementId(departementId);
  }

}

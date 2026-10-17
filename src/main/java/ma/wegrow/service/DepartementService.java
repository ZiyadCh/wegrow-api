package ma.wegrow.service;

import java.util.List;
import java.util.Optional;

import ma.wegrow.dto.DepartementsWithNbrEmpl;
import ma.wegrow.dto.EmployeeDto;
import ma.wegrow.model.Departement;
import ma.wegrow.model.Employee;
import ma.wegrow.repository.DepartementRepository;
import ma.wegrow.repository.EmployeeRepository;

/**
 * DepartementService
 */
public class DepartementService {
  private final DepartementRepository dRepository;
  private final EmployeeRepository employeeRepository;

  public DepartementService(DepartementRepository dRepository, EmployeeRepository employeeRepository) {
    this.dRepository = dRepository;
    this.employeeRepository = employeeRepository;
  }

  public void createDepartement(Departement departement) {
    dRepository.save(departement);
  }

  public List<DepartementsWithNbrEmpl> listDepartements() {
    return dRepository.findAllWithEmployeeCount();
  }

  public void deleteDepartement(Long departementId) {
    Optional<Departement> departement = dRepository.findById(departementId);
    if (departement.isEmpty()) {
      throw new IllegalArgumentException("Departement non trouve!!");
    }
    if (!departement.get().getEmployees().isEmpty()) {
      throw new IllegalStateException("peut pas supprimer departement tant qu'ill a des employant!!");
    }
    dRepository.deleteById(departementId);
  }

  public void addEmployeetoDepartement(Long departementId, Employee employee) {
    Departement departement = dRepository.findById(departementId)
        .orElseThrow(() -> new IllegalArgumentException("Departement non trouve!!"));
    employee.setDepartement(departement);
    employeeRepository.save(employee);
  }

  public List<EmployeeDto> listEmployees(Long departementId) {
    return employeeRepository.findByDepartementId(departementId).stream()
        .map(e -> new EmployeeDto(e.getId(), e.getNom(), e.getPrenom(), e.getMatricule(), e.getPoste(),
            e.getContractType()))
        .toList();
  }

}

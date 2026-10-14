package ma.wegrow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.wegrow.model.Employee;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  List<Employee> findByDepartementId(Long departementId);

  long countByDepartementId(Long departementId);
}

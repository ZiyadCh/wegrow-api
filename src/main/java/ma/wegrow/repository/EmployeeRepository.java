package ma.wegrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.wegrow.model.Employee;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

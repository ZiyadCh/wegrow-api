package ma.wegrow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.wegrow.dto.DepartementsWithNbrEmpl;
import ma.wegrow.model.Departement;

/**
 * DepartementRepository
 */
public interface DepartementRepository extends JpaRepository<Departement, Long> {

  @Query("select d.id, d.nom, d.description, count(e) from Departement d left join d.employees e group by d.id, d.nom, d.description")
  List<DepartementsWithNbrEmpl> findAllWithEmployeeCount();
}

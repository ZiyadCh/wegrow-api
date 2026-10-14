package ma.wegrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.wegrow.model.Departement;

/**
 * DepartementRepository
 */
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}

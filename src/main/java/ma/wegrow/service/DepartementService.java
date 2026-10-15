package ma.wegrow.service;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import ma.wegrow.model.Departement;
import ma.wegrow.repository.DepartementRepository;

/**
 * DepartementService
 */
public class DepartementService {
  private final DepartementRepository dRepository;

  public DepartementService(DepartementRepository dRepository) {
    this.dRepository = dRepository;
  }

  @Transactional
  private void createDepartement(Departement departement) {
    dRepository.save(departement);
  }

  private void listDepartements(Departement departement) {
    dRepository.save(departement);
  }

}

package ma.wegrow.service;

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

  private void createDepartement(Departement departement) {
    dRepository.save(departement);
  }

  private void listDepartements(Departement departement) {
    dRepository.save(departement);
  }

}

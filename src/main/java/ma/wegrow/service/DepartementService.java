package ma.wegrow.service;

import java.util.List;

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

  private List<Object[]> listDepartements(Departement departement) {
    return dRepository.findAllWithEmployeeCount();
  }

  public void deleteDepartement(Long departementId) {
    dRepository.deleteById(departementId);
  }

}

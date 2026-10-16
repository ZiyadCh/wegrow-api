package ma.wegrow.service;

import java.util.Optional;

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
    dRepository.findAllWithEmployeeCount();
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

}

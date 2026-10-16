package ma.wegrow.service;

import java.util.List;
import java.util.Optional;

import ma.wegrow.dto.DepartementsWithNbrEmpl;
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

}

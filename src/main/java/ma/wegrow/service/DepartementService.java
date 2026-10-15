package ma.wegrow.service;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.List;

import ma.wegrow.model.Departement;
import ma.wegrow.repository.DepartementRepository;

/**
 * DepartementService
 */
@NoArgsConstructor
public class DepartementService {
  @Autowired
  private DepartementRepository dRepository;

  @Transactional
  private void createDepartement(Departement departement) {
    dRepository.save(departement);
  }

  private void listDepartements(Departement departement) {
    dRepository.save(departement);
  }

}

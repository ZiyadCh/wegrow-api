package ma.wegrow.service;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;

import java.util.Map;
import java.util.List;

import ma.wegrow.model.Departement;
import ma.wegrow.repository.DepartementRepository;

/**
 * DepartementService
 */
public class DepartementService {
  @Autowired
  private DepartementRepository dRepository;

  @Transactional
  private void createDepartement(Departement departement) {
    dRepository.save(departement);
  }

}

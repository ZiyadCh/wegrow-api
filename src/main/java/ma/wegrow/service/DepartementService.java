package ma.wegrow.service;

import org.springframework.beans.factory.annotation.Autowired;

import ma.wegrow.repository.DepartementRepository;

/**
 * DepartementService
 */
public class DepartementService {
  @Autowired
  private DepartementRepository departementRepository;

  public Map<Departement, Integer> listDepartementWithEmployees() {
    return null;
  }
}

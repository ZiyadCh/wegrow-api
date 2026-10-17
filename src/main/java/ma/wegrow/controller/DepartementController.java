package ma.wegrow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.wegrow.dto.DepartementsWithNbrEmpl;
import ma.wegrow.dto.createDepartementRequest;
import ma.wegrow.model.Departement;
import ma.wegrow.service.DepartementService;

/**
 * DepartementController
 */
@RestController
@RequestMapping("/api/departement")
class DepartementController {
  private DepartementService dService;

  public DepartementController(DepartementService dService) {
    this.dService = dService;
  }

  @GetMapping()
  public List<DepartementsWithNbrEmpl> lisltDepartements() {
    return dService.listDepartements();
  }

  @PostMapping()
  public ResponseEntity<Void> createDepartement(@RequestBody createDepartementRequest req) {
    Departement d = new Departement();
    d.setNom(req.name());
    d.setDescription(req.description());
    dService.createDepartement(d);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteDepartement(@PathVariable Long id) {
    dService.deleteDepartement(id);
    return ResponseEntity.noContent().build();
  }
}

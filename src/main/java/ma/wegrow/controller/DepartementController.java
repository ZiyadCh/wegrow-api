package ma.wegrow.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.wegrow.dto.DepartementsWithNbrEmpl;
import ma.wegrow.service.DepartementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * DepartementController
 */
@RestController
@RequestMapping("/departement")
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
  public String createDepartement(@RequestBody String entity) {

    return entity;
  }

}

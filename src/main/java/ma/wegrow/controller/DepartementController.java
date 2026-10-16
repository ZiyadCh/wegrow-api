package ma.wegrow.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.wegrow.dto.DepartementDto;
import ma.wegrow.service.DepartementService;

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
  public List<DepartementDto> lisltDepartements() {
    return dService.listDepartements();
  }

}

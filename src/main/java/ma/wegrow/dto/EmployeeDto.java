package ma.wegrow.dto;

import ma.wegrow.model.ContractType;

/**
 * EmployeeDto
 */
public record EmployeeDto(Long id, String nom, String prenom, String matricule, String poste, ContractType contractType) {
}

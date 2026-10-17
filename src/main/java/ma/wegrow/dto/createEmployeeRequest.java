package ma.wegrow.dto;

import ma.wegrow.model.ContractType;

/**
 * createEmployeeRequest
 */
public record createEmployeeRequest(String nom, String prenom, String matricule, String poste, ContractType contractType) {
}

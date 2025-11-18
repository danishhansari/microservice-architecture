package com.example.patientservice.assembler;

import com.example.patientservice.dto.PatientResponseDTO;
import com.example.patientservice.model.Patient;

public class PatientAssembler {
    public static PatientResponseDTO assembleDTO(Patient patient){
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setEmail(patient.getEmail());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientResponseDTO;
    }
}

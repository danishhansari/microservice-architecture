package com.example.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;


    @NotBlank(message = "Date of birth is required")
    private String dateOfBirth;

    @NotBlank(message = "Registered Date is required")
    private String registeredDate;

    public @NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String getName() {
        return name;
    }

    public PatientRequestDTO setName(@NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 characters") String name) {
        this.name = name;
        return this;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public PatientRequestDTO setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
        return this;
    }

    public @NotBlank(message = "Address is required") String getAddress() {
        return address;
    }

    public PatientRequestDTO setAddress(@NotBlank(message = "Address is required") String address) {
        this.address = address;
        return this;
    }

    public @NotBlank(message = "Date of birth is required") String getDateOfBirth() {
        return dateOfBirth;
    }

    public PatientRequestDTO setDateOfBirth(@NotBlank(message = "Date of birth is required") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public @NotBlank(message = "Registered Date is required") String getRegisteredDate() {
        return registeredDate;
    }

    public PatientRequestDTO setRegisteredDate(@NotBlank(message = "Registered Date is required") String registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }
}

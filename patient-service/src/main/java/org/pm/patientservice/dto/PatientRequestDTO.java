package org.pm.patientservice.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.pm.patientservice.validators.CreatePatientValidationGroup;

import java.time.LocalDate;

public class PatientRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "The name must not exceed 100 letters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Date of birth is required")
    @Column(name = "birth_date")
    private String birthDate;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "Registration date is required")
    @Column(name = "registration_date")
    private String registrationDate;

    public @NotBlank(message = "Name is required") @Size(max = 100, message = "The name must not exceed 100 letters") String getName() {
        return name;
    }


    public void setName(@NotBlank(message = "Name is required") @Size(max = 100, message = "The name must not exceed 100 letters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email must be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email must be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Address is required") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is required") String address) {
        this.address = address;
    }
    public @NotBlank(message = "Date of birth is required") String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotBlank(message = "Date of birth is required") String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate ( String registrationDate) {
        this.registrationDate = registrationDate;
    }

}

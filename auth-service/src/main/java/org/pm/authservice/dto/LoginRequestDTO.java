package org.pm.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequestDTO {
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be in the valid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "The password should be 8 characters at least")
    private String password;

    public @NotBlank(message = "Email is required") @Email(message = "Email should be in the valid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be in the valid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") @Size(min = 8, message = "The password should be 8 characters at least") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 8, message = "The password should be 8 characters at least ") String password) {
        this.password = password;
    }

}

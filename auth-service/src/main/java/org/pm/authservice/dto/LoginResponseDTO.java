package org.pm.authservice.dto;

public class LoginResponseDTO {
    private final String login;

    public LoginResponseDTO(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}

package com.luizhcgoncalves.gestao_incidentes.authentication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class AuthenticationRequest {

    @Email(message = "E-mail inválido")
    @NotEmpty(message = "E-mail é obrigatório")
    @NotBlank(message = "E-mail é obrigatório")
    private String email;

    @NotEmpty(message = "É obrigatório ter uma senha")
    @NotBlank(message = "É obrigatório ter uma senha")
    @Size(min = 8, message = "A senha deve conter pelo menos 8 caracteres")
    private String password;

    public AuthenticationRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

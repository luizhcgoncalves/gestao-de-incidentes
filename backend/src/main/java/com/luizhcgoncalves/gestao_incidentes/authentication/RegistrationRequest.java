package com.luizhcgoncalves.gestao_incidentes.authentication;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegistrationRequest {

    @NotEmpty(message = "Primeiro nome é obrigatório")
    @NotBlank(message = "Primeiro nome é obrigatório")
    private String firstName;

    @NotEmpty(message = "Último nome é obrigatório")
    @NotBlank(message = "Último nome é obrigatório")
    private String lastName;

    @Email(message = "E-mail inválido")
    @NotEmpty(message = "E-mail é obrigatório")
    @NotBlank(message = "E-mail é obrigatório")
    private String email;

    @NotEmpty(message = "É obrigatório ter uma senha")
    @NotBlank(message = "É obrigatório ter uma senha")
    @Size(min = 8, message = "A senha deve conter pelo menos 8 caracteres")
    private String password;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

package com.luizhcgoncalves.gestao_incidentes.authentication;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse(String jwtToken) {
        this.token = jwtToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

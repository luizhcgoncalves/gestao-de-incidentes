package com.luizhcgoncalves.gestao_incidentes.email;

public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("ativar_conta");

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

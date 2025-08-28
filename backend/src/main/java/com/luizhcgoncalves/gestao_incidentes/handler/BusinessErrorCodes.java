package com.luizhcgoncalves.gestao_incidentes.handler;

import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {
    NO_CODE(0, HttpStatus.NOT_IMPLEMENTED, "Sem código de erro"),
    INCORRECT_CURRENT_PASSWORD(300, HttpStatus.BAD_REQUEST, "Senha atual está incorreta"),
    NEW_PASSWORD_DOES_NOT_MATCH(301, HttpStatus.BAD_REQUEST, "As senhas não são iguais"),
    ACCOUNT_LOCKED(302, HttpStatus.FORBIDDEN, "Conta do usuário está bloqueada"),
    ACCOUNT_DISABLED(303, HttpStatus.FORBIDDEN, "Conta do usuário está desabilitada"),
    BAD_CREDENTIALS(304, HttpStatus.FORBIDDEN, "Credenciais inválidas");

    private final int code;
    private final String description;
    private final HttpStatus httpStatusCode;

    BusinessErrorCodes(int code, HttpStatus httpStatusCode, String description) {
        this.code = code;
        this.description = description;
        this.httpStatusCode = httpStatusCode;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }
}

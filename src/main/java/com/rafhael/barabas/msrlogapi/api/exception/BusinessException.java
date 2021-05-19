package com.rafhael.barabas.msrlogapi.api.exception;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6003304186530169650L;

    public BusinessException(String message) {
        super(message);
    }
}

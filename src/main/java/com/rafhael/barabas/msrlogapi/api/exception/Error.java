package com.rafhael.barabas.msrlogapi.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Error {
    private String message;
    private List<FieldValidation> fields = new ArrayList<>();

    public Error() {
    }

    public Error(String message) {
        this.message = message;
    }

    public Error(String message, List<FieldValidation> fields) {
        this.message = message;
        this.fields = fields;
    }
}

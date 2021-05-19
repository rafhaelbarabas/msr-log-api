package com.rafhael.barabas.msrlogapi.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldValidation {
    private String name;
    private String validation;
}

package br.com.fugisawa.springbootreview.exception.rest;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class RestValidationExceptionDetails extends RestErrorExceptionDetails {
    private final String fields;
    private final String fieldsMessage;
}

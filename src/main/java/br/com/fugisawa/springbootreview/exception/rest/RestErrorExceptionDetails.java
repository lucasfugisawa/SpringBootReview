package br.com.fugisawa.springbootreview.exception.rest;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class RestErrorExceptionDetails {
    protected String uuid;
    protected LocalDateTime timestamp;
    protected Integer status;
    protected String message;
    protected String details;
}

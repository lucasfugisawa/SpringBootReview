package br.com.fugisawa.springbootreview.exception.rest.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class MethodNotAllowedException extends RestClientErrorException {

    public MethodNotAllowedException(String message) {
        super(message);
    }
}

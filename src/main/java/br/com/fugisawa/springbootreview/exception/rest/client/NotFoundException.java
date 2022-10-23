package br.com.fugisawa.springbootreview.exception.rest.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RestClientErrorException {

    public NotFoundException(String message) {
        super(message);
    }
}

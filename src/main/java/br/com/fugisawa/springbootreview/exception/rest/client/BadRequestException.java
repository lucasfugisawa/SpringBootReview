package br.com.fugisawa.springbootreview.exception.rest.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RestClientErrorException {

    public BadRequestException(String message) {
        super(message);
    }
}

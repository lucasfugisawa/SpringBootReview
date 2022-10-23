package br.com.fugisawa.springbootreview.exception.rest.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RestClientErrorException {

    public UnauthorizedException(String message) {
        super(message);
    }
}

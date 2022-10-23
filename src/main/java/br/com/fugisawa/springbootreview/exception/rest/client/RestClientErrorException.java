package br.com.fugisawa.springbootreview.exception.rest.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RestClientErrorException extends RuntimeException {
    public RestClientErrorException() {
    }

    public RestClientErrorException(String message) {
        super(message);
    }

    public RestClientErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestClientErrorException(Throwable cause) {
        super(cause);
    }

    public RestClientErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

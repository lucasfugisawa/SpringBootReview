package br.com.fugisawa.springbootreview.exception.rest.server;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnabailableException extends RestServerErrorException {
    public ServiceUnabailableException() {
    }

    public ServiceUnabailableException(String message) {
        super(message);
    }

    public ServiceUnabailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceUnabailableException(Throwable cause) {
        super(cause);
    }

    public ServiceUnabailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

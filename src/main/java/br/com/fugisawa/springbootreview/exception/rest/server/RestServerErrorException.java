package br.com.fugisawa.springbootreview.exception.rest.server;

public class RestServerErrorException extends RuntimeException {
    public RestServerErrorException() {
    }

    public RestServerErrorException(String message) {
        super(message);
    }

    public RestServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestServerErrorException(Throwable cause) {
        super(cause);
    }

    public RestServerErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

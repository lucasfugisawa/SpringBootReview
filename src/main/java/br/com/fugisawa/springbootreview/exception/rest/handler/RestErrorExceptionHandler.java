package br.com.fugisawa.springbootreview.exception.rest.handler;

import br.com.fugisawa.springbootreview.exception.rest.client.RestClientErrorException;
import br.com.fugisawa.springbootreview.exception.rest.client.RestClientErrorExceptionDetails;
import br.com.fugisawa.springbootreview.exception.rest.server.RestServerErrorException;
import br.com.fugisawa.springbootreview.exception.rest.server.RestServerErrorExceptionDetails;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.UUID;

@Log4j2
@ControllerAdvice
public class RestErrorExceptionHandler {

    @ExceptionHandler(RestClientErrorException.class)
    public ResponseEntity<RestClientErrorExceptionDetails> handleRestException(RestClientErrorException e) {

        org.springframework.web.bind.annotation.ResponseStatus annotation =
                e.getClass().getAnnotation(org.springframework.web.bind.annotation.ResponseStatus.class);
        HttpStatus status = annotation.value();

        String uuid = generateUUID();

        logRestError(e, uuid);

        return new ResponseEntity<>(
                RestClientErrorExceptionDetails.builder()
                        .uuid(uuid)
                        .timestamp(LocalDateTime.now())
                        .status(status.value())
                        .message("External Client/4xx error.")
                        .details(e.getMessage())
                        .build(), status
        );
    }

    @ExceptionHandler(RestServerErrorException.class)
    public ResponseEntity<RestServerErrorExceptionDetails> handleRestException(RestServerErrorException e) {

        org.springframework.web.bind.annotation.ResponseStatus annotation =
                e.getClass().getAnnotation(org.springframework.web.bind.annotation.ResponseStatus.class);
        HttpStatus status = annotation.value();

        String uuid = generateUUID();

        logRestError(e, uuid);

        return new ResponseEntity<>(
                RestServerErrorExceptionDetails.builder()
                        .uuid(generateUUID())
                        .timestamp(LocalDateTime.now())
                        .status(status.value())
                        .message("Internal Server/5xx error.")
                        .details(e.getMessage())
                        .build(), status
        );
    }

    private static void logRestError(Exception e, String uuid) {
        log.warn(uuid, e);
    }

    private static String generateUUID() {
        return UUID.randomUUID().toString();
    }

}

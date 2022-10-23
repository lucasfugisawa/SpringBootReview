package br.com.fugisawa.springbootreview.exception.rest.server;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RestServerErrorExceptionDetails {
    private String uuid;
    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String details;
}

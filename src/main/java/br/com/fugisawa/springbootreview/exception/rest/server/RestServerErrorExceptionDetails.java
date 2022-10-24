package br.com.fugisawa.springbootreview.exception.rest.server;

import br.com.fugisawa.springbootreview.exception.rest.RestErrorExceptionDetails;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class RestServerErrorExceptionDetails extends RestErrorExceptionDetails {

}

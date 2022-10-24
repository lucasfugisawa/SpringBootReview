package br.com.fugisawa.springbootreview.exception.rest.client;

import br.com.fugisawa.springbootreview.exception.rest.RestErrorExceptionDetails;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class RestClientErrorExceptionDetails extends RestErrorExceptionDetails {

}

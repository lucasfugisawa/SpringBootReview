package br.com.fugisawa.springbootreview.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ComposerPutRequestBody {
    @NotNull(message = "The Composer id is required.")
    private Long id;

    @NotEmpty(message = "The Composer name is required.")
    private String name;
}

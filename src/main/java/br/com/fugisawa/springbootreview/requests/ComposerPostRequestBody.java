package br.com.fugisawa.springbootreview.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ComposerPostRequestBody {
    @NotEmpty(message = "The Composer name is required.")
    private String name;
}

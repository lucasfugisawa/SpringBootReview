package br.com.fugisawa.springbootreview.mapper;

import br.com.fugisawa.springbootreview.domain.Composer;
import br.com.fugisawa.springbootreview.requests.ComposerPostRequestBody;
import br.com.fugisawa.springbootreview.requests.ComposerPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ComposerMapper {

    public static final ComposerMapper INSTANCE = Mappers.getMapper(ComposerMapper.class);

    public abstract Composer toComposer(ComposerPostRequestBody composerPostRequestBody);
    public abstract Composer toComposer(ComposerPutRequestBody composerPutRequestBody);
}

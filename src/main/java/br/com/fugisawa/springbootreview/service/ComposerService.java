package br.com.fugisawa.springbootreview.service;

import br.com.fugisawa.springbootreview.domain.Composer;
import br.com.fugisawa.springbootreview.exception.rest.client.NotFoundException;
import br.com.fugisawa.springbootreview.repository.ComposerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComposerService {

    private final ComposerRepository composerRepository;

    public List<Composer> listAll() {
        return composerRepository.findAll();
    }

    public List<Composer> findByName(String name) {
        return composerRepository.findByName(name);
    }

    public Composer findbyId(Long id) throws NotFoundException {
        return composerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Composer not found: " + id));
    }

    public Composer save(Composer composer) {
        return composerRepository.save(composer);
    }

    public void delete(Long id) {
        composerRepository.deleteById(id);
    }

    public void replace(Composer composer) {
        Composer savedComposer = findbyId(composer.getId());
        composer.setId(savedComposer.getId());
        composerRepository.save(composer);
    }
}

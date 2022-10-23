package br.com.fugisawa.springbootreview.controller;

import br.com.fugisawa.springbootreview.domain.Composer;
import br.com.fugisawa.springbootreview.mapper.ComposerMapper;
import br.com.fugisawa.springbootreview.requests.ComposerPostRequestBody;
import br.com.fugisawa.springbootreview.requests.ComposerPutRequestBody;
import br.com.fugisawa.springbootreview.service.ComposerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("composers")
@RequiredArgsConstructor
public class ComposerController {

    private final ComposerService composerService;

    @GetMapping
    public ResponseEntity<List<Composer>> list() {
        return ResponseEntity.ok(composerService.listAll());
    }

    @GetMapping("/find")
    public ResponseEntity<List<Composer>> findByName(@RequestParam String name) {
        return ResponseEntity.ok(composerService.findByName(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Composer> findById(@PathVariable Long id) {
        return ResponseEntity.ok(composerService.findbyId(id));
    }

    @PostMapping
    public ResponseEntity<Composer> save(@RequestBody ComposerPostRequestBody composer) {
        Composer comp = ComposerMapper.INSTANCE.toComposer(composer);
        Composer savedComposer = composerService.save(comp);
        return new ResponseEntity<>(savedComposer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        composerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody ComposerPutRequestBody composer) {
        Composer comp = ComposerMapper.INSTANCE.toComposer(composer);
        composerService.replace(comp);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

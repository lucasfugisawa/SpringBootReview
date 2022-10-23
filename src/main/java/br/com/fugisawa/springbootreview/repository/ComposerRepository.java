package br.com.fugisawa.springbootreview.repository;

import br.com.fugisawa.springbootreview.domain.Composer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComposerRepository extends JpaRepository<Composer, Long> {

    List<Composer> findByName(String name);
}

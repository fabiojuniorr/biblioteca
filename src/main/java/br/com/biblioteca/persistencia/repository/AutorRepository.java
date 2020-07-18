package br.com.biblioteca.persistencia.repository;

import br.com.biblioteca.persistencia.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}

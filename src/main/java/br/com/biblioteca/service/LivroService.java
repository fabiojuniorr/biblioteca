package br.com.biblioteca.service;

import br.com.biblioteca.persistencia.model.Livro;
import br.com.biblioteca.persistencia.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro cadastrar(Livro livro) {
        return livroRepository.save(livro);
    }
}

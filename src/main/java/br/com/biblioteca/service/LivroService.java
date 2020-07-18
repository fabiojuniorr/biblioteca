package br.com.biblioteca.service;

import br.com.biblioteca.persistencia.model.Livro;
import br.com.biblioteca.persistencia.repository.LivroRepository;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro cadastrar(Livro livro) {
        return livroRepository.save(livro);
    }
    public List<Livro> obterTodos(){
        return livroRepository.findAll();
    };

    public Optional<Livro> obterPorId(long livroId) {
        return livroRepository.findById(livroId);
    }
    public Optional<Livro> obterPorIsbn(long livroIsbn) {
        return livroRepository.findByIsbn(livroIsbn);
//        return null;
    }

    public Livro alterar(long livroId, Livro livro){

        livro.setId(livroId);
        livro = cadastrar(livro);
        return livroRepository.save(livro);
    }

    public void excluir(long livroId){
        livroRepository.deleteById(livroId);
    }
}

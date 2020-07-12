package br.com.biblioteca.controller;

import br.com.biblioteca.persistencia.model.Livro;
import br.com.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return livroService.cadastrar(livro);
    }

    //    Endpoint para obter livro por ID
    //    Endpoint para obter todos os livros
    //    Endpoint para obter o livro por ISBN
    //    Endpoint para alterar um livro
    //    Endpoint para excluir um livro
}

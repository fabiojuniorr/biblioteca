package br.com.biblioteca.controller;

import br.com.biblioteca.persistencia.model.Livro;
import br.com.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
    //    Endpoint para cadastrar os livros
    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return livroService.cadastrar(livro);
    }
    //    Endpoint para obter todos os livros
    @GetMapping
    public List<Livro> obterTodos(){
        return livroService.obterTodos();
    }
    //    Endpoint para obter livro por ID
    @GetMapping(value = "/{livroId}")
    public Optional<Livro> obterPorId(@PathVariable Long livroId){
        Optional<Livro> livro = livroService.obterPorId(livroId);

        return livro;
    }
    //    Endpoint para obter o livro por ISBN

    //    Endpoint para alterar um livro
    @PutMapping(value = "/{livroId}")
    public Livro alterar(@PathVariable long livroId,@RequestBody Livro livro ){
        livroService.alterar(livroId, livro);
        return livro;
    }
    //    Endpoint para excluir um livro
    @DeleteMapping(value = "/{livroId}")
    public void excluir(@PathVariable long livroId){
        livroService.excluir(livroId);
    }
}

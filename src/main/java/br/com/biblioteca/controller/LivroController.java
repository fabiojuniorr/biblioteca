package br.com.biblioteca.controller;

import br.com.biblioteca.persistencia.model.Autor;
import br.com.biblioteca.persistencia.model.Livro;
import br.com.biblioteca.service.AutorService;
import br.com.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;
    private AutorService autorService;

    public LivroController(LivroService livroService, AutorService autorService) {
        this.livroService = livroService;
        this.autorService = autorService;
    }
    //    Endpoint para cadastrar os livros
    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        Autor autor = livro.getAutor();
        autorService.cadastrar(autor);
        return livroService.cadastrar(livro);
    }

    //    Endpoint para obter todos os livros
    @GetMapping
    public List<Livro> obterTodos(){
        return livroService.obterTodos();
    }

    //    Endpoint para obter livro por ID
    @GetMapping(value = "/{livroId}")
    public Optional<Livro> obterPorId(@PathVariable long livroId){
        Optional<Livro> livro = livroService.obterPorId(livroId);

        return livro;
    }
    //    Endpoint para obter o livro por ISBN
    @GetMapping(value = "/isbn/{livroIsbn}")
    public Optional<Livro> obterPorIsnb(@PathVariable long livroIsbn){
        Optional<Livro> livro = livroService.obterPorIsbn(livroIsbn);
        return livro;
    }

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

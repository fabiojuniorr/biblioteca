package br.com.biblioteca.service;

import br.com.biblioteca.persistencia.model.Autor;
import br.com.biblioteca.persistencia.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private AutorRepository autorRepository;
    private AutorService(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }

    public void cadastrar(Autor autor){
        autorRepository.save(autor);
    }

}

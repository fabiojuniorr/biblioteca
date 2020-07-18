package br.com.biblioteca.persistencia.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_AUTOR")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAutor;
}

package br.com.biblioteca.persistencia.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
}

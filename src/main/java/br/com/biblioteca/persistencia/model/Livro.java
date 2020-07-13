package br.com.biblioteca.persistencia.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_LIVRO")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    private String nome;
    private Integer isbn;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}

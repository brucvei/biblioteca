package org.biblioteca.classes;

import javax.persistence.*;
import java.util.List;

@Entity
public class Livro {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String isbn;
    @Column(nullable = false)
    private List<String> autores;
    @Column(nullable = false)
    private String edicao;
    @Column(nullable = false)
    private String editora;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int ano;

    public Livro(String isbn, List<String> autores, String edicao, String editora, String nome, int ano) {
        this.isbn = isbn;
        this.autores = autores;
        this.edicao = edicao;
        this.editora = editora;
        this.nome = nome;
        this.ano = ano;
    }

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [isbn=" + isbn + ", autores=" + autores + ", edicao=" + edicao + ", editora=" + editora + ", nome=" + nome + ", ano=" + ano + "]";
    }


}

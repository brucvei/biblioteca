package org.biblioteca.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.biblioteca.classes.Livro;

import java.util.List;

public class LivroController {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LivroController() {
        emf = Persistence.createEntityManagerFactory("livro");
        em = emf.createEntityManager();
    }

    public List<Livro> listarLivros() {
        return em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
    }

    public void printarLivros() {
        List<Livro> livros = listarLivros();
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void cadastrarLivro(Livro livro) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(livro);
        tx.commit();
    }

    public Livro buscarLivro(Livro livro) {
        return em.find(Livro.class, livro);
    }

    public void atualizarLivro(Livro livro) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(livro);
        tx.commit();
    }

    public void excluirLivro(Livro livro) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(livro);
        tx.commit();
    }

    public void fecharConexao() {
        em.close();
        emf.close();
    }
}

package org.biblioteca.controllers;

import org.biblioteca.classes.Emprestimo;
import org.biblioteca.classes.Livro;
import org.biblioteca.classes.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmprestimoController {
    private List<Emprestimo> emprestimos;

    public EmprestimoController() {
        emprestimos = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date());
        emprestimos.add(emprestimo);
    }

    public void renovarEmprestimo(Emprestimo emprestimo) {
        emprestimo.setDataDevolucao(emprestimo.getDataDevolucao());
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.setDataDevolucao(new Date());
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }

    public List<Emprestimo> buscarEmprestimosPorLivro(Livro livro) {
        List<Emprestimo> resultado = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro)) {
                resultado.add(emprestimo);
            }
        }
        return resultado;
    }

    public List<Emprestimo> buscarEmprestimosPorUsuario(Usuario usuario) {
        List<Emprestimo> resultado = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().equals(usuario)) {
                resultado.add(emprestimo);
            }
        }
        return resultado;
    }
}

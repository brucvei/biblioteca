package org.biblioteca.controllers;

import org.biblioteca.classes.Livro;
import org.biblioteca.classes.Reserva;
import org.biblioteca.classes.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ReservaController {
    private List<Reserva> reservas;

    public ReservaController() {
        reservas = new ArrayList<>();
    }

    public void solicitaReservaLivro(Usuario usuario, Livro livro) {
        Reserva reserva = new Reserva(usuario, livro);
        reservas.add(reserva);
    }

    public boolean cancelaReservaLivro(Usuario usuario, Livro livro) {
        Reserva reserva = null;
        for (Reserva r : reservas) {
            if (r.getUsuario().equals(usuario) && r.getLivro().equals(livro)) {
                reserva = r;
                break;
            }
        }
        if (reserva == null) {
            System.out.println("Reserva não encontrada.");
            return false;
        }

        reservas.remove(reserva);
        return true;
    }
}

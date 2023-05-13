package org.biblioteca.controllers;

import org.biblioteca.classes.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void excluirUsuario(String login) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getLogin().equals(login)) {
                usuarios.remove(i);
                return;
            }
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public List<Usuario> buscarUsuarioPorNome(String nome) {
        List<Usuario> usuariosEncontrados = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().contains(nome)) {
                usuariosEncontrados.add(usuario);
            }
        }
        return usuariosEncontrados;
    }

    public Usuario buscarUsuarioPorLogin(String login) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                return usuario;
            }
        }
        return null;
    }
}

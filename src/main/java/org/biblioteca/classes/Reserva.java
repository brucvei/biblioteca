package org.biblioteca.classes;

import java.util.Date;

public class Reserva {
    private Long id;
    private Livro livro;
    private Usuario usuario;
    private Date dataSolicitacao;
    private boolean ativa;

    public Reserva(Long id, Livro livro, Usuario usuario, Date dataSolicitacao, boolean ativa) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataSolicitacao = dataSolicitacao;
        this.ativa = ativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}

package com.example.next.heaven.heaven.model;

import org.springframework.data.annotation.Id;

public class Usuario {
    @Id
    private Integer id;

    private String nomeUsuario;

    private String senha;

    private String tipoVip;

    public Usuario(Integer id, String nomeUsuario, String senha, String tipoVip) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipoVip = tipoVip;
    }
    
    public Usuario(String nomeUsuario, String senha, String tipoVip) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipoVip = tipoVip;
    }


    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(String tipoVip) {
        this.tipoVip = tipoVip;
    }

    
}

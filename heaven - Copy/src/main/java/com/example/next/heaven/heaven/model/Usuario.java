package com.example.next.heaven.heaven.model;

import org.springframework.data.annotation.Id;

public class Usuario {
    @Id
    private Integer id;

    private String nomeUsuario;

    private String senha;

    private Vip vip;

    public Usuario(Integer id, String nomeUsuario, String senha, Vip vip) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.vip = vip;
    }
    
    public Usuario(String nomeUsuario, String senha, Vip vip) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.vip = vip;
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

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }
    
}

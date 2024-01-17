package com.example.next.heaven.heaven.model;

import org.springframework.data.annotation.Id;

public class Veiculo {
    @Id
    private Integer id;

    private String nomeVeiculo;

    private String nomePlaca;

    private String tipoVip;

    private String imagem;

    public Veiculo() {

    }

    

    public Veiculo(Integer id, String nomeVeiculo, String nomePlaca, String tipoVip, String imagem) {
        this.id = id;
        this.nomeVeiculo = nomeVeiculo;
        this.nomePlaca = nomePlaca;
        this.tipoVip = tipoVip;
        this.imagem = imagem;
    }



    public Veiculo(String nomeVeiculo, String nomePlaca, String tipoVip, String imagem) {
        this.nomeVeiculo = nomeVeiculo;
        this.nomePlaca = nomePlaca;
        this.tipoVip = tipoVip;
        this.imagem = imagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getNomePlaca() {
        return nomePlaca;
    }

    public void setNomePlaca(String nomePlaca) {
        this.nomePlaca = nomePlaca;
    }

    public String getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(String tipoVip) {
        this.tipoVip = tipoVip;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}

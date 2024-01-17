package com.example.next.heaven.heaven.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;

public class VeiculoUsuario {
    @Id
    private Integer id;
    
    private Veiculo veiculo;

    private Usuario usuario;

    private Date dataAdquirimento;

    public VeiculoUsuario(Integer id, Veiculo veiculo, Usuario usuario, Date dataAdquirimento) {
        this.id = id;
        this.veiculo = veiculo;
        this.usuario = usuario;
        this.dataAdquirimento = dataAdquirimento;
    }

    public VeiculoUsuario(Veiculo veiculo, Usuario usuario, Date dataAdquirimento) {
        this.veiculo = veiculo;
        this.usuario = usuario;
        this.dataAdquirimento = dataAdquirimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataAdquirimento() {
        return dataAdquirimento;
    }

    public void setDataAdquirimento(Date dataAdquirimento) {
        this.dataAdquirimento = dataAdquirimento;
    }

    
    
}

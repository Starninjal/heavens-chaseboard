package com.example.next.heaven.heaven.model;

public class Vip {
    private Integer id;

    private String nivel;

    public Vip(Integer id, String nivel) {
        this.id = id;
        this.nivel = nivel;
    }

    public Vip(String nivel) {
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }



    
}

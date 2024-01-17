package com.example.next.heaven.heaven.service;

import org.springframework.stereotype.Service;

import com.example.next.heaven.heaven.model.VeiculoUsuario;

@Service
public class UsuarioVeiculoService {
    public Boolean validarVeiculoUsuario(VeiculoUsuario veiculoUsuario) {
        if(!veiculoUsuario.getVeiculo().getTipoVip().equals(veiculoUsuario.getUsuario().getTipoVip())) {
            System.out.println("Não é possível alugar o veículo pois não há compatibilidade entre o vip.");
            return true;
        }
        
        return false;

    }
}

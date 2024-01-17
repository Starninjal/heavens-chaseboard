package com.example.next.heaven.heaven.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.next.heaven.heaven.config.Conexao;
import com.example.next.heaven.heaven.model.VeiculoUsuario;
@Repository
public class VeiculoUsuarioRepository {
    private Connection conn;

    public VeiculoUsuarioRepository() {
        this.conn = Conexao.getInstance().getConexao();
    }

    public void inserirVeiculoUsuario(VeiculoUsuario veiculoUsuario) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO veiculo_usuarios(id_veiculo, id_usuario, data_adquirimento) VALUES (?, ?, ?)");
        ps.setInt(1, veiculoUsuario.getVeiculo().getId());
        ps.setInt(2, veiculoUsuario.getUsuario().getId());
        ps.setDate(3, veiculoUsuario.getDataAdquirimento());
        ps.executeUpdate();
    }
}

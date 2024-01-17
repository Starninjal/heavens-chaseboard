package com.example.next.heaven.heaven.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.next.heaven.heaven.config.Conexao;
import com.example.next.heaven.heaven.model.Usuario;
import com.example.next.heaven.heaven.model.Veiculo;
@Repository
public class VeiculoRepository {
    private Connection conexao;

    public VeiculoRepository() {
        this.conexao = Conexao.getInstance().getConexao();
    }

    public List<Veiculo> getVeiculo() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Veiculo> veiculos = new ArrayList<>();
        ps = conexao.prepareStatement("SELECT * FROM veiculo");
        rs = ps.executeQuery();
        while(rs.next()) {
            veiculos.add(new Veiculo(rs.getInt("id_veiculo"), rs.getString("nome_veiculo"), rs.getString("nome_placa"), rs.getString("tipo_vip"), rs.getString("imagem")));
        }

        return veiculos;
    }

    public Veiculo getVeiculoBy(String nomeVeiculo) throws SQLException {
        Veiculo veiculo = new Veiculo();
        PreparedStatement ps = null;
        ps = conexao.prepareStatement("SELECT * from veiculo WHERE veiculo.nome_veiculo = ?");

        ps.setString(1, nomeVeiculo);

        ResultSet rs = null;

        rs = ps.executeQuery();
        if(rs.next()) {
            veiculo = new Veiculo(rs.getInt("id_veiculo"), rs.getString("nome_veiculo"), rs.getString("nome_placa"), rs.getString("tipo_vip"), rs.getString("imagem"));
        }

        return veiculo;

        
    }
}

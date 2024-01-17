package com.example.next.heaven.heaven.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.example.next.heaven.heaven.config.Conexao;
import com.example.next.heaven.heaven.model.Usuario;
@Repository
public class UsuarioRepository {
    private Connection conexao;

    public UsuarioRepository() {
        conexao = Conexao.getInstance().getConexao();
    }

    public boolean validarLogin(Usuario usuario) throws SQLException {
        PreparedStatement ps = null;
        ps = conexao.prepareStatement("SELECT u.nome_usuario, u.senha FROM usuario u WHERE u.nome_usuario = ? and u.senha_usuario = ?");
        ps.setString(1, usuario.getNomeUsuario());
        ps.setString(2, usuario.getSenha());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            return true;
        } else {
            return false;
        }
    }

    public Usuario getUsuarioBy(String nomeUsuario) throws SQLException {
        Usuario usuario = new Usuario();
        PreparedStatement ps = null;
        ps = conexao.prepareStatement("SELECT * from usuario where usuario.nome_usuario = ?");
        ps.setString(1, nomeUsuario);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("nome_usuario"), rs.getString("senha"), rs.getString("tipo_vip"));
        }

        return usuario;
    }

    public void inserirVip(Usuario usuario) throws SQLException {
        PreparedStatement ps = null;
        ps = conexao.prepareStatement("UPDATE usuario SET tipo_vip = ? WHERE nome_usuario = ?");
        ps.setString(1, usuario.getTipoVip());
        ps.setString(2, usuario.getNomeUsuario());
        ps.executeUpdate();
    }

    
}

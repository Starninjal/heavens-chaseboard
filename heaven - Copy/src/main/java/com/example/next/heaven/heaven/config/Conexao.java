package com.example.next.heaven.heaven.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    private static Conexao conexao;

    private static Connection conn;

    public Connection getConexao() {
        return conn;
    }

    private Conexao() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/heaven_db", "root", "Btwimgood");
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao conectar com o banco de dados. Motivo: " + e.getMessage());
        }
    }

    public void fechar(PreparedStatement ps) throws SQLException {
        if(ps != null) {
            ps.close();
        }
    }

    public void fechar(ResultSet rs) throws SQLException {
        if(rs != null) {
            rs.close();
        }
    }

    public static Conexao getInstance() {
        if(conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }
    
}

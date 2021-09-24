/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.dao;

import com.lucas.javacrudpostgres.bd.ConexaoPostgres;
import com.lucas.javacrudpostgres.model.domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class UsuarioDAO extends ConexaoPostgres{
    
    public List<Usuario> listarTodos() throws Exception {
        List<Usuario> lUsuario = new LinkedList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM USUARIO ORDER BY CODIGO";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("CODIGO"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setPerfil(rs.getString("PERFIL"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
                lUsuario.add(usuario);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return lUsuario;
    }
    
    public Usuario logar(String login, String senha) throws Exception {
        Usuario usuario = new Usuario();
        try {
            this.conectar();
            String sql = "SELECT * FROM USUARIO WHERE LOGIN=? AND SENHA=?";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                usuario.setCodigo(rs.getInt("CODIGO"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setPerfil(rs.getString("PERFIL"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return usuario;
    }
    
    public void inserir(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.insertSQL("INSERT INTO USUARIO (NOME, PERFIL, LOGIN, SENHA) "
                    + "VALUES ("
                    + "'" + usuario.getNome() + "',"
                    + "'" + usuario.getPerfil() + "',"
                    + "'" + usuario.getLogin() + "',"
                    + "'" + usuario.getSenha() + "'"
                    + ");"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
    
    public void alterar(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE USUARIO SET "
                    + "NOME = '" + usuario.getNome() + "',"
                    + "PERFIL = '" + usuario.getPerfil() + "',"
                    + "LOGIN = '" + usuario.getLogin() + "',"
                    + "SENHA = '" + usuario.getSenha() + "'"
                + " WHERE "
                    + "CODIGO = '" + usuario.getCodigo() + "'"
                + ";"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
    
    public void excluir(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM USUARIO "
                + " WHERE "
                    + "CODIGO = '" + usuario.getCodigo() + "'"
                + ";"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
}

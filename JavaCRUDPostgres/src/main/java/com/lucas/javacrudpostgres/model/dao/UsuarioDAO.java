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
        try{
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
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return lUsuario;
    }
    
}

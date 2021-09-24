/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.dao;

import com.lucas.javacrudpostgres.bd.ConexaoPostgres;
import com.lucas.javacrudpostgres.model.domain.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DepartamentoDAO extends ConexaoPostgres{
    
    public List<Departamento> listarTodos() throws Exception {
        List<Departamento> lDepartamento = new LinkedList<>();
        try{
            this.conectar();
            String sql = "SELECT * FROM DEPARTAMENTO ORDER BY CODIGO";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setCodigo(rs.getInt("CODIGO"));
                departamento.setDescricao(rs.getString("DESCRICAO"));
                lDepartamento.add(departamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return lDepartamento;
    }
    
    public Departamento recuperar(int codigo) throws Exception {
        Departamento departamento = new Departamento();
        try{
            this.conectar();
            String sql = "SELECT * FROM DEPARTAMENTO WHERE CODIGO=?";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                departamento.setCodigo(rs.getInt("CODIGO"));
                departamento.setDescricao(rs.getString("DESCRICAO"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return departamento;
    }
    
    public void inserir(Departamento departamento) throws Exception {
        try{
            this.conectar();
            this.insertSQL("INSERT INTO DEPARTAMENTO (DESCRICAO) "
                    + "VALUES ("
                    + "'" + departamento.getDescricao() + "'"
                    + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
    }
    
    public void alterar(Departamento departamento) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE FUNCIONARIO SET "
                    + "DESCRICAO = '" + departamento.getDescricao() + "'"
                + " WHERE "
                    + "CODIGO = '" + departamento.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
    }
    
    public void excluir(Departamento departamento) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM DEPARTAMENTO "
                + " WHERE "
                    + "CODIGO = '" + departamento.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
    }

    
}

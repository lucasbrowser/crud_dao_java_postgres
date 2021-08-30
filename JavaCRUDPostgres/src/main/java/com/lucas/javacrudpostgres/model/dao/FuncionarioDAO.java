/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.dao;

import com.lucas.javacrudpostgres.bd.ConexaoPostgres;
import com.lucas.javacrudpostgres.model.domain.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FuncionarioDAO extends ConexaoPostgres{
    
    public List<Funcionario> listarTodos() throws Exception {
        List<Funcionario> lFuncionario = new LinkedList<>();
        try{
            this.conectar();
            DepartamentoDAO deptoDAO = new DepartamentoDAO();
            String sql = "SELECT * FROM FUNCIONARIO ORDER BY CODIGO";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(rs.getInt("CODIGO"));
                funcionario.setNome(rs.getString("NOME"));
                funcionario.setCargo(rs.getString("CARGO"));
                funcionario.setSalario(rs.getDouble("SALARIO"));
                funcionario.setDepartamento(deptoDAO.recuperar(rs.getInt("DEPARTAMENTO")));
                lFuncionario.add(funcionario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return lFuncionario;
    }
    
    public void inserir(Funcionario funcionario) throws Exception {
        try{
            this.conectar();
            this.insertSQL("INSERT INTO FUNCIONARIO (NOME, CARGO, SALARIO, DEPARTAMENTO) "
                    + "VALUES ("
                    + "'" + funcionario.getNome() + "',"
                    + "'" + funcionario.getCargo() + "',"
                    + "'" + funcionario.getSalario() + "',"
                    + "'" + funcionario.getDepartamento().getCodigo() + "'"
                    + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
    }
    
    public void alterar(Funcionario funcionario) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE FUNCIONARIO SET "
                    + "NOME = '" + funcionario.getNome() + "',"
                    + "CARGO = '" + funcionario.getCargo() + "',"
                    + "SALARIO = '" + funcionario.getSalario() + "',"
                    + "DEPARTAMENTO = '" + funcionario.getDepartamento().getCodigo() + "'"
                + " WHERE "
                    + "CODIGO = '" + funcionario.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
    }
    
}

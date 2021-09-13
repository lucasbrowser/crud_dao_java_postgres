/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.control;


import com.lucas.javacrudpostgres.model.dao.FuncionarioDAO;
import com.lucas.javacrudpostgres.model.domain.Funcionario;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FuncionarioControl {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public List<Funcionario> listarTodos() throws Exception {
        return funcionarioDAO.listarTodos();
    }
    
    public void inserirFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDAO.inserir(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDAO.alterar(funcionario);
    }
    
    public void excluirFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDAO.excluir(funcionario);
    }
    
}

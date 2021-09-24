/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.control;

import com.lucas.javacrudpostgres.model.dao.DepartamentoDAO;
import com.lucas.javacrudpostgres.model.domain.Departamento;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DepartamentoControl {
    
    DepartamentoDAO departamentoDAO = new DepartamentoDAO();
    
    public List<Departamento> listarTodos() throws Exception {
        return departamentoDAO.listarTodos();
    }
    
    public void inserirDepartamento(Departamento departamento) throws Exception {
        departamentoDAO.inserir(departamento);
    }
    
    public void alterarDepartamento(Departamento departamento) throws Exception {
        departamentoDAO.alterar(departamento);
    }
    
    public void excluirDepartamento(Departamento departamento) throws Exception {
        departamentoDAO.excluir(departamento);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.control;


import com.lucas.javacrudpostgres.model.dao.UsuarioDAO;
import com.lucas.javacrudpostgres.model.domain.Usuario;
import java.util.List;

/**
 *
 * @author lucas
 */
public class UsuarioControl {
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public List<Usuario> listarTodos() throws Exception {
        return usuarioDAO.listarTodos();
    }
    
}

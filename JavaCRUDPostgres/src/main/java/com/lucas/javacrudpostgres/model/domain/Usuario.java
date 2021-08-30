/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.domain;

import com.towel.el.annotation.Resolvable;

/**
 *
 * @author lucas
 */
public class Usuario {
    
    @Resolvable(colName = "Código")
    private long codigo;
    
    @Resolvable(colName = "Nome")
    private String nome;
    
    @Resolvable(colName = "Perfil")
    private String perfil;
    
    @Resolvable(colName = "Login")
    private String login;
    
    @Resolvable(colName = "Senha")
    private String senha;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}

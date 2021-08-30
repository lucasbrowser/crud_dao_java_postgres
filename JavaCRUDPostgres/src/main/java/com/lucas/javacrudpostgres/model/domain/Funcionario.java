/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.domain;

import com.lucas.javacrudpostgres.formatter.DoubleFormatoMoeda;
import com.towel.el.annotation.Resolvable;

/**
 *
 * @author lucas
 */
public class Funcionario {
    
    @Resolvable(colName = "Código")
    private long codigo;
    
    @Resolvable(colName = "Nome")
    private String nome;
    
    @Resolvable(colName = "Cargo")
    private String cargo;
    
    @Resolvable(colName = "Salário", formatter = DoubleFormatoMoeda.class)
    private Double salario;
    
    @Resolvable(colName = "Departamento")
    private Departamento departamento;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}

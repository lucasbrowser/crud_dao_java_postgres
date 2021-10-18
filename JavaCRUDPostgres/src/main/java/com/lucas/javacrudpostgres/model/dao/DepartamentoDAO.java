/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.model.dao;

import com.lucas.javacrudpostgres.bd.ConexaoPostgres;
import com.lucas.javacrudpostgres.model.domain.Departamento;
import java.awt.Desktop;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
                "UPDATE DEPARTAMENTO SET "
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
    
    public void departamentoRelatorio() throws JRException, Exception{
        try{
            this.conectar();
            Statement stm = this.getCon().createStatement();
            String query;
            query = "SELECT * FROM DEPARTAMENTO ORDER BY CODIGO";
            ResultSet rs = stm.executeQuery(query);
            String relatorio = "src/main/resources/reports/Departamento.jasper";
            JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(relatorio, null, jrrs);
            JasperViewer.viewReport(jp, false);
            String nomeArquivo = "src/main/resources/reports/Departamento.pdf";
            JasperExportManager.exportReportToPdfFile(jp, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            }catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
}

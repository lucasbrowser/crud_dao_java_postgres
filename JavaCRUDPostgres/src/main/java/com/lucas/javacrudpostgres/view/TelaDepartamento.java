/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.view;

import com.lucas.javacrudpostgres.control.DepartamentoControl;
import com.lucas.javacrudpostgres.model.domain.Departamento;
import com.towel.swing.table.ObjectTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TelaDepartamento extends javax.swing.JInternalFrame {
    
    private final ObjectTableModel<Departamento> otmDepartamento = new ObjectTableModel<>(Departamento.class, "codigo,descricao");
    
    private final DepartamentoControl departamentoControl = new DepartamentoControl();
    
    private Departamento departamento;

    /**
     * Creates new form TelaDepartamento
     */
    public TelaDepartamento() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }
    
    private void carregarGrade() {
        
        try {      
            otmDepartamento.setData(departamentoControl.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBarraFerramentas = new javax.swing.JPanel();
        bNovoDepto = new javax.swing.JButton();
        bSalvarDepto = new javax.swing.JButton();
        bRemoverDepto = new javax.swing.JButton();
        bCancelarDepto = new javax.swing.JButton();
        bImprimirDepto = new javax.swing.JButton();
        lblDepartamento = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpDepartamento = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Departamento");

        bNovoDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        bNovoDepto.setText("Novo");
        bNovoDepto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bNovoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoDeptoActionPerformed(evt);
            }
        });

        bSalvarDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        bSalvarDepto.setText("Salvar");
        bSalvarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarDeptoActionPerformed(evt);
            }
        });

        bRemoverDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        bRemoverDepto.setText("Remover");
        bRemoverDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverDeptoActionPerformed(evt);
            }
        });

        bCancelarDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        bCancelarDepto.setText("Cancelar");
        bCancelarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarDeptoActionPerformed(evt);
            }
        });

        bImprimirDepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impressora.png"))); // NOI18N
        bImprimirDepto.setText("Imprimir");
        bImprimirDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirDeptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBarraFerramentasLayout = new javax.swing.GroupLayout(pBarraFerramentas);
        pBarraFerramentas.setLayout(pBarraFerramentasLayout);
        pBarraFerramentasLayout.setHorizontalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bNovoDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoverDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelarDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bImprimirDepto)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pBarraFerramentasLayout.setVerticalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNovoDepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bSalvarDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(bRemoverDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(bCancelarDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(bImprimirDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lblDepartamento.setText("Departamento:");

        tpDepartamento.setModel(otmDepartamento);
        tpDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tpDepartamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblDepartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDepartamento))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(pBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoDeptoActionPerformed
        departamento = new Departamento();
        habilitarFormulario(true);
        bRemoverDepto.setEnabled(false);
        txtDepartamento.requestFocus();
    }//GEN-LAST:event_bNovoDeptoActionPerformed

    private void bSalvarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarDeptoActionPerformed
        
        departamento.setDescricao(txtDepartamento.getText().trim());

        if (departamento.getCodigo() == 0) {
            try {
                departamentoControl.inserirDepartamento(departamento);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o departamento.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            try {
                departamentoControl.alterarDepartamento(departamento);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o departamento.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

            habilitarFormulario(false);
            carregarGrade();
        
    }//GEN-LAST:event_bSalvarDeptoActionPerformed

    private void bRemoverDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverDeptoActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o departamento " + departamento + "?");
        if (opcao == 0) {
            try {
                departamentoControl.excluirDepartamento(departamento);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o departamento.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_bRemoverDeptoActionPerformed

    private void bCancelarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarDeptoActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_bCancelarDeptoActionPerformed

    private void tpDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpDepartamentoMouseClicked
        if (evt.getClickCount() >= 2) {
            
            departamento = otmDepartamento.getValue(tpDepartamento.getSelectedRow());

            txtDepartamento.setText(departamento.getDescricao());

            habilitarFormulario(true);

        }
    }//GEN-LAST:event_tpDepartamentoMouseClicked

    private void bImprimirDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirDeptoActionPerformed

        try {
            departamentoControl.imprimeRelatorio();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao imprimir o relatório.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bImprimirDeptoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarDepto;
    private javax.swing.JButton bImprimirDepto;
    private javax.swing.JButton bNovoDepto;
    private javax.swing.JButton bRemoverDepto;
    private javax.swing.JButton bSalvarDepto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JPanel pBarraFerramentas;
    private javax.swing.JTable tpDepartamento;
    private javax.swing.JTextField txtDepartamento;
    // End of variables declaration//GEN-END:variables

    private void habilitarFormulario(boolean b) {
        bNovoDepto.setEnabled(!b);
        bSalvarDepto.setEnabled(b);
        bRemoverDepto.setEnabled(b);
        bCancelarDepto.setEnabled(b);
        txtDepartamento.setEnabled(b);
        tpDepartamento.setEnabled(!b);

        if (!b) {
            limpaFormulario();
        }
    }
    
    private void limpaFormulario() {
        departamento = null;
        txtDepartamento.setText("");
    }

}

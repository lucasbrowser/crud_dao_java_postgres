/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javacrudpostgres.view;

import com.lucas.javacrudpostgres.control.FuncionarioControl;
import com.lucas.javacrudpostgres.model.domain.Departamento;
import com.lucas.javacrudpostgres.model.domain.Funcionario;
import com.towel.swing.table.ObjectTableModel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TelaFuncionario extends javax.swing.JInternalFrame {
    
    private final ObjectTableModel<Funcionario> otmFuncionario = new ObjectTableModel<>(Funcionario.class, "codigo,nome,cargo,salario,departamento");
    
    private final FuncionarioControl funcionarioControl = new FuncionarioControl();
    
    private Funcionario funcionario;

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }
    
    public void setDepartamento(Departamento departamento) {
        ftfDepartamento.setValue(departamento);
    }
    
    private void carregarGrade() {
        
        try {      
            otmFuncionario.setData(funcionarioControl.listarTodos());
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
        bNovo = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        pConteudo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ftfSalario = new javax.swing.JFormattedTextField();
        lblDepartamento = new javax.swing.JLabel();
        ftfDepartamento = new javax.swing.JFormattedTextField();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpFuncionario = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Funcion??rios");

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        bNovo.setMnemonic(KeyEvent.VK_N);
        bNovo.setText("Novo");
        bNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        bSalvar.setMnemonic(KeyEvent.VK_S);
        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        bRemover.setMnemonic(KeyEvent.VK_R);
        bRemover.setText("Remover");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        bCancelar.setMnemonic(KeyEvent.VK_C);
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBarraFerramentasLayout = new javax.swing.GroupLayout(pBarraFerramentas);
        pBarraFerramentas.setLayout(pBarraFerramentasLayout);
        pBarraFerramentasLayout.setHorizontalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBarraFerramentasLayout.setVerticalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(bNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel1.setText("Cargo:");

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCargoKeyPressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sal??rio:");

        ftfSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        ftfSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftfSalarioKeyPressed(evt);
            }
        });

        lblDepartamento.setText("Departamento:");

        ftfDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftfDepartamentoKeyPressed(evt);
            }
        });

        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tpFuncionario.setModel(otmFuncionario);
        tpFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tpFuncionario);

        javax.swing.GroupLayout pConteudoLayout = new javax.swing.GroupLayout(pConteudo);
        pConteudo.setLayout(pConteudoLayout);
        pConteudoLayout.setHorizontalGroup(
            pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pConteudoLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo))
                    .addGroup(pConteudoLayout.createSequentialGroup()
                        .addComponent(ftfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        pConteudoLayout.setVerticalGroup(
            pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ftfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDepartamento)
                        .addComponent(ftfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pConteudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        TelaModalDepartamento buscaDepartamento = new TelaModalDepartamento(this);
        buscaDepartamento.setVisible(true);
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        funcionario = new Funcionario();
        habilitarFormulario(true);
        bRemover.setEnabled(false);
        txtNome.requestFocus();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tpFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpFuncionarioMouseClicked
        if (evt.getClickCount() >= 2) {
            funcionario = otmFuncionario.getValue(tpFuncionario.getSelectedRow());

            txtNome.setText(funcionario.getNome());
            txtCargo.setText(funcionario.getCargo());
            ftfSalario.setValue(funcionario.getSalario());
            ftfDepartamento.setValue(funcionario.getDepartamento());

            habilitarFormulario(true);

        }
    }//GEN-LAST:event_tpFuncionarioMouseClicked

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        if (validarFormulario()) {
            funcionario.setNome(txtNome.getText().trim());
            funcionario.setCargo(txtCargo.getText());
            funcionario.setSalario(Double.parseDouble(String.valueOf(ftfSalario.getValue())));
            funcionario.setDepartamento((Departamento) ftfDepartamento.getValue());

            if (funcionario.getCodigo() == 0) {
                try {
                    funcionarioControl.inserirFuncionario(funcionario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o funcion??rio.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    funcionarioControl.alterarFuncionario(funcionario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o funcion??rio.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } 

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_bSalvarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          txtCargo.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          ftfSalario.requestFocus();
        }
    }//GEN-LAST:event_txtCargoKeyPressed

    private void ftfSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfSalarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          ftfDepartamento.requestFocus();
        }
    }//GEN-LAST:event_ftfSalarioKeyPressed

    private void ftfDepartamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDepartamentoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          bBuscar.requestFocus();
        }
    }//GEN-LAST:event_ftfDepartamentoKeyPressed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o funcion??rio " + funcionario + "?");
        if (opcao == 0) {
            try {
                funcionarioControl.excluirFuncionario(funcionario);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o funcion??rio.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_bRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRemover;
    private javax.swing.JButton bSalvar;
    private javax.swing.JFormattedTextField ftfDepartamento;
    private javax.swing.JFormattedTextField ftfSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pBarraFerramentas;
    private javax.swing.JPanel pConteudo;
    private javax.swing.JTable tpFuncionario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

private void habilitarFormulario(boolean b) {
        bNovo.setEnabled(!b);
        bSalvar.setEnabled(b);
        bRemover.setEnabled(b);
        bCancelar.setEnabled(b);
        bBuscar.setEnabled(b);
        txtNome.setEnabled(b);
        txtCargo.setEnabled(b);
        ftfSalario.setEnabled(b);
        ftfDepartamento.setEnabled(b);
        tpFuncionario.setEnabled(!b);

        if (!b) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        funcionario = null;
        txtNome.setText("");
        txtCargo.setText("");
        ftfSalario.setValue(0d);
        ftfDepartamento.setValue(null);
    }
    
    private boolean validarFormulario() {
        if (txtNome.getText().trim().length() < 3) {
            JOptionPane.showMessageDialog(this, "Nome inv??lido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        return true;
    }

}

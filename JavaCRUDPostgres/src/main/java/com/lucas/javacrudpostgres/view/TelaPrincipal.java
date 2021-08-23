package com.lucas.javacrudpostgres.view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * 
 *
 * @author lucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        Locale locale = new Locale("pt","BR"); 
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat dataHora = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'.'",locale); 
        lblData.setText("Diamantino-MT, "+dataHora.format(calendar.getTime()));
        UIManager.put("OptionPane.yesButtonText", "Sim"); 
        UIManager.put("OptionPane.noButtonText", "Não"); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        bCombustivel = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miDepartamento = new javax.swing.JMenuItem();
        mFerramentas = new javax.swing.JMenu();
        miTestarConexao = new javax.swing.JMenuItem();
        mSistema = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Empresarial");
        setIconImages(null);

        toolBar.setFloatable(false);

        bCombustivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/departamento.png"))); // NOI18N
        bCombustivel.setText("Departamento");
        bCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCombustivel.setFocusable(false);
        bCombustivel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCombustivel.setMargin(new java.awt.Insets(2, 12, 2, 12));
        bCombustivel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDepartamentoActionPerformed(evt);
            }
        });
        toolBar.add(bCombustivel);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);

        lblNome.setText(".");
        desktopPane.add(lblNome);
        lblNome.setBounds(790, 580, 160, 14);

        lblData.setText("........");
        desktopPane.add(lblData);
        lblData.setBounds(670, 600, 310, 14);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        mCadastro.setText("Cadastro");

        miDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miDepartamento.setMnemonic('V');
        miDepartamento.setText("Departamento");
        miDepartamento.setToolTipText("");
        miDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDepartamentoActionPerformed(evt);
            }
        });
        mCadastro.add(miDepartamento);

        menuBar.add(mCadastro);

        mFerramentas.setText("Ferramentas");

        miTestarConexao.setText("Testar Conexão");
        miTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTestarConexaoActionPerformed(evt);
            }
        });
        mFerramentas.add(miTestarConexao);

        menuBar.add(mFerramentas);

        mSistema.setText("Sistema");

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mSistema.add(miSair);

        menuBar.add(mSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1040, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        int q = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (q==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDepartamentoActionPerformed
        // TODO add your handling code here:
        TelaDepartamento c = new TelaDepartamento();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miDepartamentoActionPerformed

    private void miTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTestarConexaoActionPerformed
        TestaConexao c = new TestaConexao();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miTestarConexaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCombustivel;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblNome;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenu mSistema;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miDepartamento;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miTestarConexao;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}

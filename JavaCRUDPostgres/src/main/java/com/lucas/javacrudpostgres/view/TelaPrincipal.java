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

        jLabel1 = new javax.swing.JLabel();
        toolBar = new javax.swing.JToolBar();
        bCombustivel = new javax.swing.JButton();
        bFuncionario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        pStatusBar = new javax.swing.JPanel();
        lblUsuarioTitle = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miDepartamento = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();
        miUsuario = new javax.swing.JMenuItem();
        mFerramentas = new javax.swing.JMenu();
        miTestarConexao = new javax.swing.JMenuItem();
        mSistema = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

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

        bFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        bFuncionario.setText("Funcionário");
        bFuncionario.setFocusable(false);
        bFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        toolBar.add(bFuncionario);

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
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pStatusBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuarioTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuarioTitle.setText("Usuário:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblData.setText("........");

        javax.swing.GroupLayout pStatusBarLayout = new javax.swing.GroupLayout(pStatusBar);
        pStatusBar.setLayout(pStatusBarLayout);
        pStatusBarLayout.setHorizontalGroup(
            pStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStatusBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pStatusBarLayout.setVerticalGroup(
            pStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pStatusBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuarioTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pStatusBar, java.awt.BorderLayout.PAGE_END);

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

        miFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miFuncionario.setText("Funcionário");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        mCadastro.add(miFuncionario);

        miUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miUsuario.setText("Usuário");
        miUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioActionPerformed(evt);
            }
        });
        mCadastro.add(miUsuario);

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

        setSize(new java.awt.Dimension(1040, 735));
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

    private void miFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionarioActionPerformed
        TelaFuncionario c = new TelaFuncionario();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFuncionarioActionPerformed

    private void miUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioActionPerformed
        TelaUsuario c = new TelaUsuario();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCombustivel;
    private javax.swing.JButton bFuncionario;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioTitle;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenu mSistema;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miDepartamento;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miTestarConexao;
    private javax.swing.JMenuItem miUsuario;
    private javax.swing.JPanel pStatusBar;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}

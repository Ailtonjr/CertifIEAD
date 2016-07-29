package br.iead.certifiead.gui;

import br.iead.certifiead.controller.UsuarioCtrl;
import br.iead.certifiead.modelo.Usuario;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class UsuarioGUI extends javax.swing.JDialog {

    private boolean editar;
    private int id;
    private UsuarioCtrl usuarioCtrl;

    /**
     * Creates new form UsuarioGUI
     */
    public UsuarioGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.usuarioCtrl = new UsuarioCtrl(this);
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Principal = new javax.swing.JPanel();
        label_Nome = new javax.swing.JLabel();
        field_Nome = new javax.swing.JTextField();
        label_Login = new javax.swing.JLabel();
        field_Login = new javax.swing.JTextField();
        label_Senha = new javax.swing.JLabel();
        field_Senha = new javax.swing.JPasswordField();
        scrollPane_Usuarios = new javax.swing.JScrollPane();
        table_Usuarios = new javax.swing.JTable();
        button_Novo = new javax.swing.JButton();
        button_Excluir = new javax.swing.JButton();
        button_Confirmar = new javax.swing.JButton();
        button_Editar = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        label_Separador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CertifIEAD - Sistema de Certificados IEAD - Gerenciar Usuários");

        label_Nome.setText("Nome");

        field_Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Nome.setEnabled(false);

        label_Login.setText("Login");

        field_Login.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Login.setEnabled(false);

        label_Senha.setText("Senha");

        field_Senha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Senha.setEnabled(false);

        table_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Usuarios.getTableHeader().setReorderingAllowed(false);
        table_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_UsuariosMouseClicked(evt);
            }
        });
        scrollPane_Usuarios.setViewportView(table_Usuarios);

        button_Novo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Novo.setText("Novo");
        button_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NovoActionPerformed(evt);
            }
        });

        button_Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Excluir.setText("Excluir");
        button_Excluir.setEnabled(false);
        button_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExcluirActionPerformed(evt);
            }
        });

        button_Confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Confirmar.setText("Confirmar");
        button_Confirmar.setEnabled(false);
        button_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ConfirmarActionPerformed(evt);
            }
        });

        button_Editar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Editar.setText("Editar");
        button_Editar.setEnabled(false);
        button_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditarActionPerformed(evt);
            }
        });

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Usuários Cadastrados");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Senha)
                            .addComponent(label_Login)
                            .addComponent(label_Nome))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addComponent(label_Separador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(separator))
                            .addComponent(field_Senha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_Login, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_Nome)
                            .addComponent(scrollPane_Usuarios)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Confirmar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Confirmar)
                    .addComponent(button_Excluir)
                    .addComponent(button_Novo)
                    .addComponent(button_Editar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Separador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_UsuariosMouseClicked
        if (evt.getClickCount() == 1) {
            id = Integer.parseInt((String) table_Usuarios.getValueAt(table_Usuarios.getSelectedRow(), 0));
            Usuario usuario = usuarioCtrl.buscar(id);
            field_Nome.setText(usuario.getNome());
            field_Login.setText(usuario.getLogin());
            field_Senha.setText(usuario.getSenha());
            modificarBotoesConfirmar();
        }
    }//GEN-LAST:event_table_UsuariosMouseClicked

    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed
        modificarBotoesEditar();
        editar = false;
        field_Nome.setText("");
        field_Login.setText("");
        field_Senha.setText("");
        button_Confirmar.transferFocus();
    }//GEN-LAST:event_button_NovoActionPerformed

    private void button_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExcluirActionPerformed
//        System.out.println("id "+ idSelecionado + " login " + loginSelecionado);
//        con.removerUsuario(idSelecionado, loginSelecionado);
//        modelo = consulta.geraTabelaUsuarios();
//        table_Usuarios.setModel(modelo);
//        button_Novo.doClick();
    }//GEN-LAST:event_button_ExcluirActionPerformed

    private void button_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConfirmarActionPerformed
        boolean commit;
        if (editar) {
            commit = usuarioCtrl.alterar(id, field_Nome.getText(), field_Login.getText(), field_Senha.getText());
            System.out.println("");
        } else {
            commit = usuarioCtrl.inserir(field_Nome.getText(), field_Login.getText(), field_Senha.getText());
        }
        if (commit) {
            if (!editar) {
                atualizarTabela();
                table_Usuarios.setRowSelectionInterval(table_Usuarios.getRowCount() - 1, table_Usuarios.getRowCount() - 1);
            } else {
                atualizarTabela();
            }
            modificarBotoesConfirmar();
        }
    }//GEN-LAST:event_button_ConfirmarActionPerformed

    private void button_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditarActionPerformed
        modificarBotoesEditar();
        editar = true;
    }//GEN-LAST:event_button_EditarActionPerformed

    private void atualizarTabela() {
        table_Usuarios.setModel(usuarioCtrl.gerarTabela());
    }

    private void modificarBotoesConfirmar() {
        button_Novo.setEnabled(true);
        button_Editar.setEnabled(true);
        button_Excluir.setEnabled(true);
        button_Confirmar.setEnabled(false);
        field_Nome.setEnabled(false);
        field_Login.setEnabled(false);
        field_Senha.setEnabled(false);
    }

    private void modificarBotoesEditar() {
        button_Novo.setEnabled(false);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(true);
        field_Nome.setEnabled(true);
        field_Login.setEnabled(true);
        field_Senha.setEnabled(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioGUI dialog = new UsuarioGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Confirmar;
    private javax.swing.JButton button_Editar;
    private javax.swing.JButton button_Excluir;
    private javax.swing.JButton button_Novo;
    private javax.swing.JTextField field_Login;
    private javax.swing.JTextField field_Nome;
    private javax.swing.JPasswordField field_Senha;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Senha;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Usuarios;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable table_Usuarios;
    // End of variables declaration//GEN-END:variables
}

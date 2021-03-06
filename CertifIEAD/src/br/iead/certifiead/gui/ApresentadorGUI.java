package br.iead.certifiead.gui;

import br.iead.certifiead.controller.ApresentadorCtrl;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ApresentadorGUI extends javax.swing.JDialog {

    private boolean editar;
    private int id;
    private ApresentadorCtrl apresentadorCtrl;

    /**
     * Creates new form ApresentadorGUI
     */
    public ApresentadorGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.apresentadorCtrl = new ApresentadorCtrl(this);
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Principal = new javax.swing.JPanel();
        button_Novo = new javax.swing.JButton();
        button_Editar = new javax.swing.JButton();
        button_Confirmar = new javax.swing.JButton();
        button_Excluir = new javax.swing.JButton();
        scrollPane_Apresentadores = new javax.swing.JScrollPane();
        table_Apresentadores = new javax.swing.JTable();
        label_Nome = new javax.swing.JLabel();
        field_Nome = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        label_Separador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CertifIEAD - Sistema de Certificados IEAD - Gerenciar Apresentadores");

        panel_Principal.setToolTipText("");
        panel_Principal.setMaximumSize(new java.awt.Dimension(480, 420));
        panel_Principal.setMinimumSize(new java.awt.Dimension(480, 420));
        panel_Principal.setName("dfd"); // NOI18N

        button_Novo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Novo.setText("Novo");
        button_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NovoActionPerformed(evt);
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

        button_Confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Confirmar.setText("Confirmar");
        button_Confirmar.setEnabled(false);
        button_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ConfirmarActionPerformed(evt);
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

        table_Apresentadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Apresentadores.getTableHeader().setReorderingAllowed(false);
        table_Apresentadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ApresentadoresMouseClicked(evt);
            }
        });
        scrollPane_Apresentadores.setViewportView(table_Apresentadores);

        label_Nome.setText("Nome");

        field_Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Nome.setEnabled(false);

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Apresentadores Cadastrados");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_Nome)
                        .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane_Apresentadores, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_PrincipalLayout.createSequentialGroup()
                            .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(button_Confirmar)))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(label_Separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Nome)
                .addGap(6, 6, 6)
                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Novo)
                    .addComponent(button_Editar)
                    .addComponent(button_Excluir)
                    .addComponent(button_Confirmar))
                .addGap(18, 18, 18)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Separador)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(scrollPane_Apresentadores, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modificarBotoesConfirmar() {
        button_Novo.setEnabled(true);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(false);
        field_Nome.setEnabled(false);
    }

    private void modificarBotoesEditar() {
        button_Novo.setEnabled(false);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(true);
        field_Nome.setEnabled(true);
    }

    private void atualizarTabela() {
        table_Apresentadores.setModel(apresentadorCtrl.gerarTabela());
    }

    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed
        modificarBotoesEditar();
        editar = false;
        field_Nome.setText("");
        button_Confirmar.transferFocus();
    }//GEN-LAST:event_button_NovoActionPerformed

    private void button_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditarActionPerformed
        modificarBotoesEditar();
        editar = true;
    }//GEN-LAST:event_button_EditarActionPerformed

    private void button_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConfirmarActionPerformed
        boolean commit;
        if (editar) {
            commit = apresentadorCtrl.alterar(id, field_Nome.getText());
            System.out.println("");
        } else {
            commit = apresentadorCtrl.inserir(field_Nome.getText());
        }
        if (commit) {
            if (!editar) {
                atualizarTabela();
                table_Apresentadores.setRowSelectionInterval(table_Apresentadores.getRowCount() - 1, table_Apresentadores.getRowCount() - 1);
            } else {
                atualizarTabela();
            }
            modificarBotoesConfirmar();
        }
    }//GEN-LAST:event_button_ConfirmarActionPerformed

    private void button_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExcluirActionPerformed

    }//GEN-LAST:event_button_ExcluirActionPerformed

    private void table_ApresentadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ApresentadoresMouseClicked

    }//GEN-LAST:event_table_ApresentadoresMouseClicked

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
            java.util.logging.Logger.getLogger(ApresentadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApresentadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApresentadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApresentadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ApresentadorGUI dialog = new ApresentadorGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField field_Nome;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Apresentadores;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable table_Apresentadores;
    // End of variables declaration//GEN-END:variables
}

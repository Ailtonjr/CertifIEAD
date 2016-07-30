package br.iead.certifiead.gui;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ApresentadorGUI extends javax.swing.JDialog {

    /**
     * Creates new form ApresentadorGUI
     */
    public ApresentadorGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        table_Clientes = new javax.swing.JTable();
        field_Caminho = new javax.swing.JTextField();
        label_Assinatura = new javax.swing.JLabel();
        label_Nome = new javax.swing.JLabel();
        field_Nome = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        label_Separador = new javax.swing.JLabel();
        button_Buscar = new javax.swing.JButton();
        imagePanel_Assinatura = new org.jdesktop.swingx.JXImagePanel();
        label_Preview = new javax.swing.JLabel();

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

        table_Clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Clientes.getTableHeader().setReorderingAllowed(false);
        table_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ClientesMouseClicked(evt);
            }
        });
        scrollPane_Apresentadores.setViewportView(table_Clientes);

        field_Caminho.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Caminho.setEnabled(false);
        field_Caminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_CaminhoActionPerformed(evt);
            }
        });

        label_Assinatura.setText("Assinatura Digital");

        label_Nome.setText("Nome");

        field_Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Nome.setEnabled(false);

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Apresentadores Cadastrados");

        button_Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Find 2.png"))); // NOI18N
        button_Buscar.setText("Buscar");
        button_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BuscarActionPerformed(evt);
            }
        });

        imagePanel_Assinatura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout imagePanel_AssinaturaLayout = new javax.swing.GroupLayout(imagePanel_Assinatura);
        imagePanel_Assinatura.setLayout(imagePanel_AssinaturaLayout);
        imagePanel_AssinaturaLayout.setHorizontalGroup(
            imagePanel_AssinaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel_AssinaturaLayout.setVerticalGroup(
            imagePanel_AssinaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        label_Preview.setText("Preview");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(label_Preview)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(imagePanel_Assinatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_Nome)
                                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_Assinatura)
                                .addComponent(scrollPane_Apresentadores, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                    .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                            .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(field_Caminho, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button_Confirmar)
                                        .addComponent(button_Buscar))))
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addComponent(label_Separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Nome)
                .addGap(6, 6, 6)
                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(label_Assinatura)
                .addGap(4, 4, 4)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_Caminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Buscar))
                .addGap(6, 6, 6)
                .addComponent(label_Preview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagePanel_Assinatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modificarBotoesConfirmar() {
        button_Novo.setEnabled(true);
        button_Editar.setEnabled(true);
        button_Excluir.setEnabled(true);
        button_Confirmar.setEnabled(false);
        field_Nome.setEnabled(false);
        field_Nome.setEnabled(false);
        field_Caminho.setEnabled(false);
    }

    private void modificarBotoesEditar() {
        button_Novo.setEnabled(false);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(true);
        field_Nome.setEnabled(true);
        field_Nome.setEnabled(true);
        field_Caminho.setEnabled(true);
    }
    
    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed

    }//GEN-LAST:event_button_NovoActionPerformed

    private void button_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditarActionPerformed


    }//GEN-LAST:event_button_EditarActionPerformed

    private void button_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConfirmarActionPerformed

    }//GEN-LAST:event_button_ConfirmarActionPerformed

    private void button_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExcluirActionPerformed

    }//GEN-LAST:event_button_ExcluirActionPerformed

    private void table_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ClientesMouseClicked
      
    }//GEN-LAST:event_table_ClientesMouseClicked

    private void field_CaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_CaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_CaminhoActionPerformed

    private void button_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_BuscarActionPerformed

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
    private javax.swing.JButton button_Buscar;
    private javax.swing.JButton button_Confirmar;
    private javax.swing.JButton button_Editar;
    private javax.swing.JButton button_Excluir;
    private javax.swing.JButton button_Novo;
    private javax.swing.JTextField field_Caminho;
    private javax.swing.JTextField field_Nome;
    private org.jdesktop.swingx.JXImagePanel imagePanel_Assinatura;
    private javax.swing.JLabel label_Assinatura;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Preview;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Apresentadores;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable table_Clientes;
    // End of variables declaration//GEN-END:variables
}

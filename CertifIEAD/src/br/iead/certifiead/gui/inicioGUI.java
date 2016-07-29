package br.iead.certifiead.gui;

import br.iead.certifiead.modelo.Usuario;

public class inicioGUI extends javax.swing.JFrame {
    
    public inicioGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        panel_Principal = new javax.swing.JPanel();
        scrollPane_Chamados = new javax.swing.JScrollPane();
        table_Chamados = new javax.swing.JTable();
        comboBox_Filtro = new javax.swing.JComboBox();
        button_Excluir = new javax.swing.JButton();
        button_Novo = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu_Gerenciar = new javax.swing.JMenu();
        menuItem_Chamado = new javax.swing.JMenuItem();
        menuItem_Usuario = new javax.swing.JMenuItem();
        menuItem_Programador = new javax.swing.JMenuItem();
        menu_Relatorio = new javax.swing.JMenu();
        menu_Sobre = new javax.swing.JMenu();
        menu_Sair = new javax.swing.JMenu();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CertifIEAD - Sistema de Certificados IEAD - Início");
        setResizable(false);

        table_Chamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Pai", "Mãe", "Data", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane_Chamados.setViewportView(table_Chamados);

        comboBox_Filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Impressos", "Não Impressos", "Todos" }));

        button_Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Excluir.setText("Excluir");
        button_Excluir.setEnabled(false);

        button_Novo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Novo.setText("Novo");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane_Chamados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBox_Filtro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)))
                .addGap(97, 97, 97))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(comboBox_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane_Chamados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Excluir)
                    .addComponent(button_Novo))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        menu_Gerenciar.setText("Gerenciar");

        menuItem_Chamado.setText("Certificado");
        menuItem_Chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ChamadoActionPerformed(evt);
            }
        });
        menu_Gerenciar.add(menuItem_Chamado);

        menuItem_Usuario.setText("Usuário");
        menuItem_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UsuarioActionPerformed(evt);
            }
        });
        menu_Gerenciar.add(menuItem_Usuario);

        menuItem_Programador.setText("Pastor");
        menu_Gerenciar.add(menuItem_Programador);

        menuBar.add(menu_Gerenciar);

        menu_Relatorio.setText("Relatórios");
        menuBar.add(menu_Relatorio);

        menu_Sobre.setText("Sobre");
        menuBar.add(menu_Sobre);

        menu_Sair.setText("Sair");
        menuBar.add(menu_Sair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UsuarioActionPerformed
        UsuarioGUI usuarioGUI = new UsuarioGUI(this, true);
        usuarioGUI.setVisible(true);
    }//GEN-LAST:event_menuItem_UsuarioActionPerformed

    private void menuItem_ChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ChamadoActionPerformed
        CertificadoGUI certificadoGUI = new CertificadoGUI(this, true);
        certificadoGUI.setVisible(true);
    }//GEN-LAST:event_menuItem_ChamadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Excluir;
    private javax.swing.JButton button_Novo;
    private javax.swing.JComboBox comboBox_Filtro;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItem_Chamado;
    private javax.swing.JMenuItem menuItem_Programador;
    private javax.swing.JMenuItem menuItem_Usuario;
    private javax.swing.JMenu menu_Gerenciar;
    private javax.swing.JMenu menu_Relatorio;
    private javax.swing.JMenu menu_Sair;
    private javax.swing.JMenu menu_Sobre;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Chamados;
    private javax.swing.JTable table_Chamados;
    // End of variables declaration//GEN-END:variables
}

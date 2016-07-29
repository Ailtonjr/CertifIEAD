package br.iead.certifiead.gui;

import javax.swing.JFrame;


public class CertificadoGUI extends javax.swing.JDialog {

    public CertificadoGUI(java.awt.Frame parent, boolean modal, int numChamado) {
        super(parent, modal);
        initComponents();
    }

    public CertificadoGUI(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Principal = new javax.swing.JPanel();
        label_Status = new javax.swing.JLabel();
        label_Cidade = new javax.swing.JLabel();
        comboBox_Cidade = new javax.swing.JComboBox();
        label_addCidade = new javax.swing.JLabel();
        label_Estado = new javax.swing.JLabel();
        comboBox_Estado = new javax.swing.JComboBox();
        label_addEstado = new javax.swing.JLabel();
        label_DataApresentacao = new javax.swing.JLabel();
        formatted_DataApresentação = new org.jdesktop.swingx.JXDatePicker();
        formatted_DataApresentação.setFormats(new String[]{"yyyy-MM-dd"});
        label_Separador = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        button_Imprimir = new javax.swing.JButton();
        button_Salvar = new javax.swing.JButton();
        textField_Nome = new javax.swing.JTextField();
        label_Nome = new javax.swing.JLabel();
        formatted_DataNascimento = new org.jdesktop.swingx.JXDatePicker();
        formatted_DataApresentação.setFormats(new String[]{"yyyy-MM-dd"});
        label_DataNascimento = new javax.swing.JLabel();
        textField_Pai = new javax.swing.JTextField();
        label_Pai = new javax.swing.JLabel();
        textField_Mae = new javax.swing.JTextField();
        label_Mae = new javax.swing.JLabel();
        textField_Cartorio = new javax.swing.JTextField();
        label_Cartorio = new javax.swing.JLabel();
        textField_NumCartorio = new javax.swing.JTextField();
        label_NumCartorio = new javax.swing.JLabel();
        textField_FolhaCartorio = new javax.swing.JTextField();
        label_FolhaCartorio = new javax.swing.JLabel();
        textField_LivroCartorio = new javax.swing.JTextField();
        label_LivroCartorio = new javax.swing.JLabel();
        comboBox_Apresentador = new javax.swing.JComboBox();
        label_addApresentador = new javax.swing.JLabel();
        label_Apresentador = new javax.swing.JLabel();
        textField_NumIgreja = new javax.swing.JTextField();
        label_NumIgreja = new javax.swing.JLabel();
        textField_LivroIgreja = new javax.swing.JTextField();
        label_LivroIgreja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CertifIEAD - Sistema de Certificados IEAD - Novo/Editar Certificado");
        setAlwaysOnTop(true);
        setResizable(false);

        label_Cidade.setText("Cidade");

        comboBox_Cidade.setSelectedItem(null);
        comboBox_Cidade.setToolTipText("");

        label_addCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Create.png"))); // NOI18N

        label_Estado.setText("Estado");

        comboBox_Estado.setSelectedItem(null);

        label_addEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Create.png"))); // NOI18N

        label_DataApresentacao.setText("Data da apresentação");

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Informaçoes do certificado");

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        button_Imprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Text.png"))); // NOI18N
        button_Imprimir.setText("Imprimir");

        button_Salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Save.png"))); // NOI18N
        button_Salvar.setText("Salvar");

        textField_Nome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_Nome.setText("Nome");

        label_DataNascimento.setText("Data de Nascimento");

        textField_Pai.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_Pai.setText("Nome do pai");

        textField_Mae.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_Mae.setText("Nome da mãe");

        textField_Cartorio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_Cartorio.setText("Cartório");

        textField_NumCartorio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_NumCartorio.setText("Número");

        textField_FolhaCartorio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_FolhaCartorio.setText("Folha");

        textField_LivroCartorio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_LivroCartorio.setText("Livro");

        comboBox_Apresentador.setSelectedItem(null);

        label_addApresentador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/Create.png"))); // NOI18N

        label_Apresentador.setText("Apresentador");

        textField_NumIgreja.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_NumIgreja.setText("Número Igreja");

        textField_LivroIgreja.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        label_LivroIgreja.setText("Livro Igreja");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label_Separador)
                        .addGap(13, 13, 13)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(label_Status))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(label_FolhaCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(textField_Nome)
                        .addContainerGap())
                    .addComponent(label_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Pai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField_Pai)
                            .addComponent(label_Mae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField_Mae)
                            .addComponent(label_Cartorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField_Cartorio)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_NumCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addComponent(textField_NumCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(textField_FolhaCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_LivroCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_LivroCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(formatted_DataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_Cidade)
                                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                                .addComponent(comboBox_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_addCidade)))
                                        .addGap(42, 42, 42)
                                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_Estado)
                                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                                .addComponent(comboBox_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label_addEstado)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button_Salvar)
                                    .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textField_NumIgreja, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_NumIgreja, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_LivroIgreja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField_LivroIgreja)
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addComponent(button_Imprimir)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatted_DataApresentação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_DataApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addComponent(comboBox_Apresentador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_addApresentador))
                            .addComponent(label_Apresentador))
                        .addGap(20, 20, 20))))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Separador)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label_Status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_DataApresentacao)
                        .addGap(4, 4, 4)
                        .addComponent(formatted_DataApresentação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Apresentador)
                        .addGap(3, 3, 3)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_addApresentador)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(comboBox_Apresentador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Cidade)
                    .addComponent(label_Estado))
                .addGap(1, 1, 1)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_addEstado)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_addCidade)
                            .addComponent(comboBox_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_DataNascimento)
                .addGap(4, 4, 4)
                .addComponent(formatted_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(label_Pai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Mae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Cartorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Cartorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(label_NumCartorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_NumCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(textField_LivroCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_FolhaCartorio)
                            .addComponent(label_LivroCartorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_FolhaCartorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NumIgreja)
                    .addComponent(label_LivroIgreja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_NumIgreja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_LivroIgreja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Imprimir)
                    .addComponent(button_Salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CertificadoGUI dialog = new CertificadoGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton button_Imprimir;
    private javax.swing.JButton button_Salvar;
    private javax.swing.JComboBox comboBox_Apresentador;
    private javax.swing.JComboBox comboBox_Cidade;
    private javax.swing.JComboBox comboBox_Estado;
    private org.jdesktop.swingx.JXDatePicker formatted_DataApresentação;
    private org.jdesktop.swingx.JXDatePicker formatted_DataNascimento;
    private javax.swing.JLabel label_Apresentador;
    private javax.swing.JLabel label_Cartorio;
    private javax.swing.JLabel label_Cidade;
    private javax.swing.JLabel label_DataApresentacao;
    private javax.swing.JLabel label_DataNascimento;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_FolhaCartorio;
    private javax.swing.JLabel label_LivroCartorio;
    private javax.swing.JLabel label_LivroIgreja;
    private javax.swing.JLabel label_Mae;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_NumCartorio;
    private javax.swing.JLabel label_NumIgreja;
    private javax.swing.JLabel label_Pai;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JLabel label_Status;
    private javax.swing.JLabel label_addApresentador;
    private javax.swing.JLabel label_addCidade;
    private javax.swing.JLabel label_addEstado;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField textField_Cartorio;
    private javax.swing.JTextField textField_FolhaCartorio;
    private javax.swing.JTextField textField_LivroCartorio;
    private javax.swing.JTextField textField_LivroIgreja;
    private javax.swing.JTextField textField_Mae;
    private javax.swing.JTextField textField_Nome;
    private javax.swing.JTextField textField_NumCartorio;
    private javax.swing.JTextField textField_NumIgreja;
    private javax.swing.JTextField textField_Pai;
    // End of variables declaration//GEN-END:variables
}

package br.iead.certifiead.gui;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    public LoginGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        button_Cancelar = new javax.swing.JButton();
        button_Entrar = new javax.swing.JButton();
        field_Senha = new javax.swing.JPasswordField();
        label_Senha = new javax.swing.JLabel();
        field_Login = new javax.swing.JTextField();
        label_Login = new javax.swing.JLabel();
        label_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CertifIEAD - Sistema de Certificados IEAD - Login");
        setResizable(false);

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/login.png"))); // NOI18N

        button_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/No.png"))); // NOI18N
        button_Cancelar.setText("Cancelar");
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
            }
        });

        button_Entrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/iead/certifiead/gui/image/OK.png"))); // NOI18N
        button_Entrar.setText("Entrar");
        button_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EntrarActionPerformed(evt);
            }
        });

        field_Senha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                field_SenhaKeyPressed(evt);
            }
        });

        label_Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Senha.setText("Senha");

        field_Login.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                field_LoginKeyPressed(evt);
            }
        });

        label_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Login.setText("Login");

        label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_Titulo.setText("        CertifIEAD        ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_logo)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Entrar))
                            .addComponent(field_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Senha)
                            .addComponent(label_Login))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Titulo)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(label_Senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_Entrar)
                            .addComponent(button_Cancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_CancelarActionPerformed

    private void button_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EntrarActionPerformed
        login();
    }//GEN-LAST:event_button_EntrarActionPerformed

    private void field_SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_SenhaKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_field_SenhaKeyPressed

    private void field_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_LoginKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            field_Login.transferFocus();
        }
    }//GEN-LAST:event_field_LoginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JButton button_Entrar;
    private javax.swing.JTextField field_Login;
    private javax.swing.JPasswordField field_Senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Senha;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo;
    // End of variables declaration//GEN-END:variables

    private void login() {
        this.setVisible(false);
        inicioGUI certificadoGUI = new inicioGUI();
        certificadoGUI.setVisible(true);
    }
}

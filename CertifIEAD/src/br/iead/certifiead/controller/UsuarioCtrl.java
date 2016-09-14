package br.iead.certifiead.controller;

import br.iead.certifiead.dao.UsuarioDAO;
import br.iead.certifiead.modelo.Usuario;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class UsuarioCtrl {

    private DefaultTableModel modelo;
    private final Component aThis;
    private UsuarioDAO dao;
    private ResultSet rs;

    public UsuarioCtrl(Component aThis) {
        this.aThis = aThis;
        this.dao = new UsuarioDAO();
    }

    public boolean inserir(String nome, String login, String senha) {
        if (nome.isEmpty() || login.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(aThis, "Todos os Campos são de preencimento obrigatórios");
        } else {
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setLogin(login);
            usuario.setSenha(senha);
            try {
                dao.inserir(usuario);
                JOptionPane.showMessageDialog(aThis, "Usuário " + usuario.getNome() + " inserido com sucesso!");
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(aThis, "Erro ao inserir usuário: " + usuario.getNome() + "\n\n Causa: Usuário já existente", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean alterar(int id, String nome, String login, String senha) {
        if (nome.isEmpty() || login.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(aThis, "Todos os Campos são de preencimento obrigatórios");
        } else {
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNome(nome);
            usuario.setLogin(login);
            usuario.setSenha(senha);
            try {
                dao.alterar(usuario);
                JOptionPane.showMessageDialog(aThis, "Usuario " + nome + " atualizado com sucesso!");
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(aThis, "Erro ao atualizar usuario " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return false;
    }

    public Usuario buscar(int id) {
        try {
            rs = dao.buscar(id);
            Usuario usuario = new Usuario();
            rs.next();
            usuario.setId(id);
            usuario.setNome(rs.getString(2));
            usuario.setLogin(rs.getString(3));
            usuario.setSenha(rs.getString(4));
            return usuario;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(aThis, "Erro ao buscar usuario ID " + id, "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return null;
    }

    public boolean remover(Usuario usuario) {
        try {
            dao.remover(usuario);
            JOptionPane.showMessageDialog(aThis, "Usuário " + usuario.getNome() + " apagado com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(aThis, "Erro ao apagar usuário: " + usuario.getNome() + "\n\n Causa: Usuário já existente", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return false;
    }

    public DefaultTableModel gerarTabela() {
        try {
            rs = dao.buscarUsuarios();
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            modelo.addColumn("ID");
            modelo.addColumn("Nome");
            modelo.addColumn("Login");

            String vetor[] = new String[3];

            while (rs.next()) {
                for (int i = 1; i <= 3; i++) {
                    vetor[i - 1] = rs.getString(i);
                }
                modelo.addRow(vetor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(aThis, "Erro ao buscar usuarios", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return modelo;
    }
}

package br.iead.certifiead.controller;

import br.iead.certifiead.dao.ApresentadorDAO;
import br.iead.certifiead.modelo.Apresentador;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ApresentadorCtrl {

    private DefaultTableModel modelo;
    private final Component aThis;
    private ApresentadorDAO dao;
    private ResultSet rs;

    public ApresentadorCtrl(Component aThis) {
        this.aThis = aThis;
        this.dao = new ApresentadorDAO();
    }

    public boolean inserir(String nome) {
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(aThis, "O campo Nome é de preencimento obrigatórios");
        } else {
            Apresentador apresentador = new Apresentador();
            apresentador.setNome(nome);
            try {
                dao.inserir(apresentador);
                JOptionPane.showMessageDialog(aThis, "Apresentador " + apresentador.getNome() + " inserido com sucesso!");
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(aThis, "Erro ao inserir apresentador: " + apresentador.getNome() + "\n\n Causa: Usuário já existente", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean alterar(int id, String nome) {
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(aThis, "O campo Nome é de  preencimento obrigatórios");
        } else {
            Apresentador apresentador = new Apresentador();
            apresentador.setId(id);
            apresentador.setNome(nome);
            try {
                dao.alterar(apresentador);
                JOptionPane.showMessageDialog(aThis, "Apresentador " + nome + " atualizado com sucesso!");
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(aThis, "Erro ao atualizar apresentador " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return false;
    }

    public Apresentador buscar(int id) {
        try {
            rs = dao.buscar(id);
            Apresentador apresentador = new Apresentador();
            rs.next();
            apresentador.setId(id);
            apresentador.setNome(rs.getString(2));
            return apresentador;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(aThis, "Erro ao buscar o Apresentador ID " + id, "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return null;
    }

    public DefaultTableModel gerarTabela() {
        try {
            rs = dao.buscarApresentadores();
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            modelo.addColumn("ID");
            modelo.addColumn("Nome");

            String vetor[] = new String[2];

            while (rs.next()) {
                for (int i = 1; i <= 2; i++) {
                    vetor[i - 1] = rs.getString(i);
                }
                modelo.addRow(vetor);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(aThis, "Erro ao buscar apresentadores", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return modelo;
    }
}

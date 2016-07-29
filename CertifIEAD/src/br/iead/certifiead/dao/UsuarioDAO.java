package br.iead.certifiead.dao;

import br.iead.certifiead.factory.ConnectionFactory;
import br.iead.certifiead.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class UsuarioDAO {

    private Connection con;
    PreparedStatement preparedStatement;
    private Statement statement;

    public UsuarioDAO(){
        this.con = new ConnectionFactory().getConnection();        
    }

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "BEGIN;"
                + "INSERT INTO usuario (nome, login, senha) VALUES (?, ?, ?);"
                + "COMMIT";
        preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getLogin());
        preparedStatement.setString(3, usuario.getSenha());
        preparedStatement.execute();
        preparedStatement.close();

    }

    public void alterar(Usuario usuario) throws SQLException {
        String sql = "BEGIN;"
                + "UPDATE usuario SET nome = ?, login = ?, senha = ? WHERE id = ? ;"
                + "COMMIT";

        preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getLogin());
        preparedStatement.setString(3, usuario.getSenha());
        preparedStatement.setInt(4, usuario.getId());

        preparedStatement.executeUpdate();

    }

    public ResultSet buscar(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id =" + id;
        ResultSet rs = null;
        statement = con.createStatement();
        rs = statement.executeQuery(sql);
        return rs;
    }

    public ResultSet buscarUsuarios() throws SQLException {
        String sql = "SELECT * FROM usuario";
        statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        return rs;
    }
}

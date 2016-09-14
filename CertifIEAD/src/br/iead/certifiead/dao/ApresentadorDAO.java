package br.iead.certifiead.dao;

import br.iead.certifiead.factory.ConnectionFactory;
import br.iead.certifiead.modelo.Apresentador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ApresentadorDAO {

    private Connection con;
    PreparedStatement preparedStatement;
    private Statement statement;

    public ApresentadorDAO(){
        this.con = new ConnectionFactory().getConnection();        
    }

    public void inserir(Apresentador apresentador) throws SQLException {
        String sql = "BEGIN;"
                + "INSERT INTO apresentador (nome) VALUES (?);"
                + "COMMIT";
        preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, apresentador.getNome());
        preparedStatement.execute();
        preparedStatement.close();

    }

    public void alterar(Apresentador apresentador) throws SQLException {
        String sql = "BEGIN;"
                + "UPDATE apresentador SET nome = ? WHERE id = ? ;"
                + "COMMIT";

        preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, apresentador.getNome());
        preparedStatement.setInt(2, apresentador.getId());

        preparedStatement.executeUpdate();

    }

    public ResultSet buscar(int id) throws SQLException {
        String sql = "SELECT * FROM apresentador WHERE id =" + id;
        ResultSet rs = null;
        statement = con.createStatement();
        rs = statement.executeQuery(sql);
        return rs;
    }

    public ResultSet buscarApresentadores() throws SQLException {
        String sql = "SELECT * FROM apresentador";
        statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        return rs;
    }
}

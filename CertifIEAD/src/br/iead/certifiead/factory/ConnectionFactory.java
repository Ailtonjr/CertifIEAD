package br.iead.certifiead.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ConnectionFactory {
    // Parametros de Conexão
    private String url = "jdbc:postgresql://localhost:5432/db_certifiead";
    private String usuario = "certifiead";
    private String senha = "123";
    private Connection conexao;

    // Retorna uma conexão com o BD
    public Connection getConnection() {
        try {
            this.conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

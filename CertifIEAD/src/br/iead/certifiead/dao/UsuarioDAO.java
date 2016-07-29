package br.iead.certifiead.dao;

import br.iead.certifiead.factory.ConnectionFactory;
import br.iead.certifiead.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,login,senha) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

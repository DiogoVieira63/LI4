package Model;

import java.sql.*;

public class UtilizadorDAO {

    public static Utilizador create(Connection c, String nome, String password, String email) throws SQLException{
        String querry = "INSERT INTO utilizador VALUES('" + email + "','" + password + "','" + nome + "','Nope',0,2)";
        Statement st = c.createStatement(); st.executeUpdate(querry);
        return new Utilizador(nome, password, email);
    }

    public static Utilizador create(Connection c, String nome, String password, String email, String num_telefone) throws SQLException{
        String querry = "INSERT INTO utilizador VALUES('" + email + "','" + password + "','" + nome + "','" + num_telefone + "',0,2)";
        Statement st = c.createStatement(); st.executeUpdate(querry);
        return new Utilizador(nome, password, email,num_telefone);
    }

    public static Utilizador logIn (Connection connection, String email, String password){
        String query = "SElECT * FROM utilizador WHERE email = '" + email + "' AND LoggedIn = 0 AND Password = '" + password + "'";
        try{
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                Utilizador u = new Utilizador (rs.getString("Nome"), 
                                               rs.getString("Password"),
                                               rs.getString("Email"),
                                               rs.getString("Telemovel"),
                                               rs.getInt("LoggedIn") != 0/*,
                                               rs.getInt("Configuracoes_notificacao") */);
                //Trocar na Database
            }
            return null;
        }catch(SQLException e){ return null; }
    }
}

package Model;

import java.sql.*;

public class UtilizadorDAO {

    public static Utilizador create(Connection c, String nome, String password, String email) throws SQLException{
        String query = "INSERT INTO utilizador (Email,Password,Nome,LoggedIn,Configuracoes_notificacao )VALUES (?, ?, ?, ?,?)";
        PreparedStatement pstmt = c.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        pstmt.setString(3, nome);
        pstmt.setInt(4, 1);
        pstmt.setInt(5,1);
        pstmt.execute();
        return new Utilizador(nome, password, email);
    }

    public static Utilizador create(Connection c, String nome, String password, String email, String num_telefone) throws SQLException{
        String query = "INSERT INTO utilizador (Email,Password,Nome,Telemovel,LoggedIn,Configuracoes_notificacao )VALUES (?, ?,?, ?, ?,?)";
        PreparedStatement pstmt = c.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        pstmt.setString(3, nome);
        pstmt.setString(4,num_telefone);
        pstmt.setInt(5, 1);
        pstmt.setInt(6,1);
        pstmt.execute();
        return new Utilizador(nome, password, email,num_telefone);
    }

    public static Utilizador logIn (Connection connection, String email, String password) throws SQLException {
        String query = "UPDATE utilizador SET LoggedIn = ? WHERE email = ? AND password = ? AND LoggedIn = ?";
        PreparedStatement ps;
        ps = connection.prepareStatement(query);
        ps.setInt(1,1);
        ps.setString(2,email);
        ps.setString(3,password);
        ps.setInt(4,0);
        int i = ps.executeUpdate();
        if (i  == 0){//THROW EXCEPTION UTILIZADOR NÃO EXISTE
            System.out.println("Login Inválido");
        }
        else {
            System.out.println("Login feito com sucesso");
            return getUtilizador(connection,email);
        }
        return null; //TODO THROW EXCEPTION
        /*
        String query = "SElECT * FROM utilizador WHERE email = '" + email + "' AND LoggedIn = 0 AND Password = '" + password + "'";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            Utilizador u = new Utilizador (rs.getString("Nome"),
                    rs.getString("Password"),
                    rs.getString("Email"),
                    rs.getString("Telemovel"),
                    rs.getInt("LoggedIn") != 0,
                                               rs.getInt("Configuracoes_notificacao") );
            //Trocar na Database


         }
         */
    }

    private static void logOut(Connection connection,String email) throws SQLException {
        String query = "UPDATE utilizador SET LoggedIn = ? WHERE email = ? AND LoggedIn = ?";
        PreparedStatement ps;
        ps = connection.prepareStatement(query);
        ps.setInt(1,0);
        ps.setString(2,email);
        ps.setInt(3,1);
        int i = ps.executeUpdate();
        if (i == 0){
            System.out.println("Logout falhado");//TODO:THROW EXCEPTION
        }
        else System.out.println("Logout efetuado");
    }






    public static Utilizador getUtilizador (Connection connection, String email) throws SQLException {
        String query ="SELECT * FROM utilizador WHERE email = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,email);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            String password = rs.getString("Password");
            String nome = rs.getString("Nome");
            String telemovel = rs.getString("Telemovel");
            boolean loggedIn = rs.getBoolean("LoggedIn");
            int confNotificao = rs.getInt("Configuracoes_notificacao");//TODO NOT SURE ABOUT THIS
            return new Utilizador(email,password,nome,telemovel,loggedIn);
        }

    }


    

}

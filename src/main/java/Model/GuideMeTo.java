package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class GuideMeTo {
    
    private GestaoUtilizador utilizadores;
    private GestaoCentroHistorico centros;

    public GuideMeTo() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/LI4","root","root");
        this.utilizadores = new GestaoUtilizador(conn);
        this.centros = new GestaoCentroHistorico(conn);

    }

    public void registarUtilizador(String nome, String password, String email) throws SQLException {
        utilizadores.newUser(nome, password, email);
    }

    public void registarUtilizador(String nome, String password, String email, String n_telemovel) throws SQLException {
        utilizadores.newUser(nome, password, email, n_telemovel);
    }

    public boolean logIn(String email, String password) {
        try{
            utilizadores.logIn(email,password);
            return  true;
        }catch (SQLException e){return  false;}
    }

    public void logOut(String email) throws SQLException {
        utilizadores.logOut(email);
    }

    public String getHiperligacao (String nomeCentro){ 
        return centros.getHiperligacao(nomeCentro); 
    }

    public Map<String,Localizacao> getLocalizacoes () throws SQLException {
        return centros.getLocalizacoes();
    }

    public String getNome (String email){
        try {
            String nome = utilizadores.getNome(email);
            System.out.println("Nome is " + nome);
            return nome;
        }catch (SQLException e){
            return "";
        }
    }

    public CentroHistorico getCentro (String centro) throws SQLException {
        return centros.getCentro(centro);
    }
    
}

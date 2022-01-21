package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class GuideMeTo implements IGuideMeToFacade{
    
    private GestaoUtilizador utilizadores;
    private GestaoCentroHistorico centros;

    public GuideMeTo() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/LI4","root","root");
        this.utilizadores = new GestaoUtilizador(conn);
        this.centros = new GestaoCentroHistorico(conn);

    }

    public boolean registarUtilizador(String nome, String password, String email){
        return utilizadores.newUser(nome, password, email);
    }

    public boolean registarUtilizador(String nome, String password, String email, String n_telemovel){
        return utilizadores.newUser(nome, password, email, n_telemovel);
    }

    public void logIn(String email, String password) throws SQLException {
        utilizadores.logIn(email,password);
    }

    public void logOut(String email) throws SQLException {
        utilizadores.logOut(email);
    }

    public void configurarConta(){
 
    }

    public String getHiperligacao (String nomeCentro){ 
        return centros.getHiperligacao(nomeCentro); 
    }

    /*
    public List<Notificacao> getNotificacoes(String nome){
        return utilizadores.getNotificacoes(nome);
    }
    */
    
    public List<Notificacao> getNotificacoes(){
        return utilizadores.getAllNotificacoes();
    }

    public void configNotificacoes(int ID, boolean ativa){

    }

    public List<CentroHistorico> getCentroHistoricos(){
        return centros.getCentrosHistoricos();
    }

    public String enviaNotificacao(int id){
        return null;
    }

    
}

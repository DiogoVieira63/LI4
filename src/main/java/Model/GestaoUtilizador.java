package Model;

import java.sql.*;
import java.util.*;

public class GestaoUtilizador {

    private UtilizadorDAO utilizadores;

    public GestaoUtilizador(Connection connection){
        this.utilizadores = new UtilizadorDAO(connection);
    }

    public void newUser (String nome, String password, String email) throws SQLException {
        Utilizador user = utilizadores.create(nome, password, email);
    }

    public void newUser (String nome, String password, String email, String num_telefone) throws SQLException {
        Utilizador user = utilizadores.create(nome, password, email, num_telefone);
    }

	public void logIn(String email, String password) throws SQLException {
        utilizadores.logIn(email,password);
	}

    public void logOut(String email) throws SQLException {
        utilizadores.logOut(email);
    }

    public boolean validaRegisto(String email, String nome, String password){
        return false;
    }

    public boolean validaRegisto(String email, String n_telemovel, String nome, String password){
        return false;
    }

    public boolean validaLogin(String email, String password){
        return false;
    }

    public void adicionaVisita(String email,String centro) throws SQLException {
        Utilizador utilizador = utilizadores.getUtilizador(email);
        utilizador.addVisita(centro);

    }

    public void configurarNotificacao(int IDNotificacao, boolean ativa){

    }

    public void eliminarNotificacoes(int id){

    }

    public void configurarPassword(String pass){

    }

    public void avaliar(String nome, double eval_preservacao, double eval_experiencia, double eval_facilidade, double eval_estetica){

    }

    public String getNome(String email) throws SQLException {
        return utilizadores.getUtilizador(email).getNome();
    }

    public List<String> getCentrosVisitados(String email) throws SQLException {
        Utilizador utilizador = utilizadores.getUtilizador(email);
        return utilizador.getVisitados();
    }
}

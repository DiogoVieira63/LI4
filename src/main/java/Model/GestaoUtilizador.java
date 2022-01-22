package Model;

import java.sql.*;
import java.util.*;

public class GestaoUtilizador {

    private UtilizadorDAO utilizadores;

    public GestaoUtilizador(Connection connection){
        this.utilizadores = new UtilizadorDAO(connection);
    }

    public boolean newUser (String nome, String password, String email){
        try{
            Utilizador user = utilizadores.create(nome, password, email);
            return true;
        }catch(SQLException e){ return false; }
    }

    public boolean newUser (String nome, String password, String email, String num_telefone){
        try{
            Utilizador user = utilizadores.create(nome, password, email, num_telefone);
            return true;
        }catch(SQLException e){ return false; }
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

    public void adicionaVisita(CentroHistorico visita){

    }

    public void configurarNotificacao(int IDNotificacao, boolean ativa){

    }

    public void eliminarNotificacoes(int id){

    }

    public void configurarPassword(String pass){

    }

    public void avaliar(String nome, double eval_preservacao, double eval_experiencia, double eval_facilidade, double eval_estetica){

    }
}

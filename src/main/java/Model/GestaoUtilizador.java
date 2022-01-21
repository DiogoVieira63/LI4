package Model;

import java.sql.*;
import java.util.*;

public class GestaoUtilizador implements IUtilizadorFacade{

    private UtilizadorDAO utilizadores;

    public GestaoUtilizador(Connection connection){
        this.utilizadores = new UtilizadorDAO(connection);
    }

    public boolean newUser (String nome, String password, String email){
        try{
            Utilizador user = utilizadores.create(nome, password, email);
            return true;
        }catch(SQLException e){
            return false;
        }
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

     /*
    public List<Notificacao> getNotificacoes(String nome){
        return this.utilizadores.get(nome).getNotificacoes();
    }



	public List<Notificacao> getAllNotificacoes() {
        List<Notificacao> lista = new ArrayList<>();
		for (Utilizador u : this.utilizadores.values()){
            lista.addAll(u.getNotificacoes());
        }
        return lista;
	}

	    public List<Notificacao> listarNotificacoes(String u){
        return utilizadores.get(u).getNotificacoes();
    }


      */

    public boolean validaRegisto(String email, String nome, String password){
        return false;
    }

    public boolean validaRegisto(String email, String n_telemovel, String nome, String password){
        return false;
    }

    public boolean validaLogin(String email, String password){
        return false;
    }

    public void enviaNotificacao(Notificacao n){

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

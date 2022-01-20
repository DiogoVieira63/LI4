package src;

import java.util.*;

public class GestaoUtilizador implements IUtilizadorFacade{

    private Map<String,Utilizador> utilizadores = new HashMap(); 


    public boolean newUser (String nome, String password, String email){
        Utilizador user = new Utilizador(nome, password, email);
        this.utilizadores.put(nome, user);
        return true;
    }

    public boolean newUser (String nome, String password, String email, String num_telefone){
        Utilizador user = new Utilizador(nome, password, email, num_telefone);
        this.utilizadores.put(nome, user);
        return true;
    }

	public boolean logIn(String email, String password) {
        if (utilizadores.get(email).getEmail().equals(email) && 
            utilizadores.get(email).getPassword().equals(password)){
            utilizadores.get(email).setLoggedIn(true);
            return true;
        } 
        else{
             utilizadores.get(email).setLoggedIn(false);
             return false;
        }
	}

    public boolean logOut(String email) {
        if(utilizadores.get(email).isLoggedIn()){
            utilizadores.get(email).setLoggedIn(false);
            return true; 
        } 
        return false;
    }


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

    public List<Notificacao> listarNotificacoes(String u){
        return utilizadores.get(u).getNotificacoes();
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

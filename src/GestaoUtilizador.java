import java.util.*;

public class GestaoUtilizador {
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
        utilizadores.get(email).getPassword().equals(password)) return true;
        else return false;
	}

    public boolean logOut(String email, String password) {
        return false;
    }


    public List<Notificacao> getNotificoes(String nome){
        return this.utilizadores.get(nome).getNotificacoes();
    }

	public List<Notificacao> getAllNotificacoes() {
		return null;
	}
}

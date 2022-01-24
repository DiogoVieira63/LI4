package Model;

import java.sql.*;
import java.util.*;

public class GestaoUtilizador implements IGestaoUtilizador{

    private UtilizadorDAO utilizadores;

    public GestaoUtilizador(Connection connection){
        this.utilizadores = new UtilizadorDAO(connection);
    }

    public void newUser (String nome, String password, String email) throws SQLException {
        utilizadores.create(nome, password, email);
    }

    public void newUser (String nome, String password, String email, String num_telefone) throws SQLException {
        utilizadores.create(nome, password, email, num_telefone);
    }

	public void logIn(String email, String password) throws SQLException {
        utilizadores.logIn(email,password);
	}

    public void logOut(String email) throws SQLException {
        utilizadores.logOut(email);
    }

    public void adicionaVisita(String email,String centro) throws SQLException {
        Utilizador utilizador = utilizadores.getUtilizador(email);
        utilizador.addVisita(centro);

    }

    public String getNome(String email) throws SQLException {
        return utilizadores.getUtilizador(email).getNome();
    }

    public List<String> getCentrosVisitados(String email) throws SQLException {
        Utilizador utilizador = utilizadores.getUtilizador(email);
        return utilizador.getVisitados();
    }
}

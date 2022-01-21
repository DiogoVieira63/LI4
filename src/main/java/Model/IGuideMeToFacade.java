package Model;

import java.sql.SQLException;
import java.util.*;

public interface IGuideMeToFacade {

    boolean registarUtilizador(String nome, String password, String email);
    boolean registarUtilizador(String nome, String password, String email, String n_telemovel);
    void logIn(String email, String password) throws SQLException;
    void logOut(String email) throws SQLException;
    void configurarConta();
    String getHiperligacao (String nomeCentro);
    List<Notificacao> getNotificacoes();
    void configNotificacoes(int ID, boolean ativa);
    List<CentroHistorico> getCentroHistoricos();
    String enviaNotificacao(int id);
}

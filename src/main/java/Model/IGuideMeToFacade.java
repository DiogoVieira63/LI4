package Model;

import java.util.*;

public interface IGuideMeToFacade {

    boolean registarUtilizador(String nome, String password, String email);
    boolean registarUtilizador(String nome, String password, String email, String n_telemovel);
    boolean logIn(String email, String password);
    boolean logOut(String email);
    void configurarConta();
    String getHiperligacao (String nomeCentro);
    List<Notificacao> getNotificacoes();
    void configNotificacoes(int ID, boolean ativa);
    List<CentroHistorico> getCentroHistoricos();
    String enviaNotificacao(int id);
}

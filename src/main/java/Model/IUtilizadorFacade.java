package Model;

import java.util.*;

public interface IUtilizadorFacade {

    boolean validaRegisto(String email, String nome, String password);
    boolean validaRegisto(String email, String n_telemovel, String nome, String password);
    boolean validaLogin(String email, String password);
    void enviaNotificacao(Notificacao n);
    boolean logOut(String email);
    void adicionaVisita(CentroHistorico visita);
    List<Notificacao> listarNotificacoes(String u);
    void configurarNotificacao(int IDNotificacao, boolean ativa);
    void eliminarNotificacoes(int id);
    void configurarPassword(String pass);
    void avaliar(String nome, double eval_preservacao, double eval_experiencia, double eval_facilidade, double eval_estetica);
}

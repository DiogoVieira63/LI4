package Model;

import java.util.*;

public interface ICentroHistoricoFacade {
    
    List<Horario> getHorario(String nome);
    Horario getHorario(String nome, int dia);
    double getPrecario(String nome);
    String getDescricao(String nome);
    String getHiperligacao(String nome);
    double getAvaliacao_geral(String nome);
    List<Review> getListaAvaliacao(String nome);
    String getRua(String nome);
    void atualizaHorario(String nome, int dia, Horario h);
    void atualizaHorario(String nome, List<Horario> horarios);
    void atualizaPrecario(String nome, double p);
    double calcAvalGeral(String nome);
}

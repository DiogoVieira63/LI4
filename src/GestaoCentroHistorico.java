package src;

import java.util.*;
import java.util.stream.Collectors;


public class GestaoCentroHistorico implements ICentroHistoricoFacade{
    private Map<String,CentroHistorico> centros = new HashMap<>();


    public List<CentroHistorico> getCentrosHistoricos() {
        return this.centros
            .values()
            .stream()
            .collect(Collectors.toList());
    }

    public List<Horario> getHorario(String nome){
        try{
            return centros.get(nome).getHorarios();
        } catch(NullPointerException e) { return null; }
    }

    public Horario getHorario(String nome, int dia) {
        try {
            return centros.get(nome).getHorario(dia);
        } catch(NullPointerException e) { return null; }
    }


    public double getPrecario(String nome){
        try{
            return centros.get(nome).getPrecario();
        } catch(NullPointerException e) { return 0; }
    }

    public String getDescricao(String nome){
        try{
            return centros.get(nome).getDescricao();
        } catch(NullPointerException e) { return null; }
    }

    public String getHiperligacao(String nome){
        try{
            return centros.get(nome).getSite();
        } catch(NullPointerException e) { return null; }
    }

    public double getAvaliacao_geral(String nome){
        try{
            return centros.get(nome).getAvaliacao();
        } catch(NullPointerException e) { return 0; }
    }


    public List<Review> getListaAvaliacao(String nome){
        try{
            return centros.get(nome).getReviews();
        } catch(NullPointerException e) { return null; }
    }

    public String getRua(String nome){
        try{
            return centros.get(nome).getRua();
        } catch(NullPointerException e) { return null; }
    }

    public void atualizaHorario(String nome, int dia, Horario h){
        centros.get(nome).setHorario(dia, h);
    }

    public void atualizaHorario(String nome, List<Horario> horarios){
        Horario[] horarioArray = new Horario[7];
        for (int i = 0; i < 7; i++){
            horarioArray[i] = horarios.get(i);
        }
        centros.get(nome).atualizaHorario(horarioArray);
    }

    public void atualizaPrecario(String nome, double p){
        centros.get(nome).setPrecario(p);
    }

    public double calcAvalGeral(String nome){
        return centros.get(nome).calcAvalGeral();
    }

}

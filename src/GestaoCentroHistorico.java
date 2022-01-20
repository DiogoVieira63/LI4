import java.util.*;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

public class GestaoCentroHistorico {
    private Map<String,CentroHistorico> centros = new HashMap();

    public String getSite(String nome) {
        try { 
            return centros.get(nome).getSite();
        }catch(NullPointerException e){ return null; }
    }

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

    }


    public void atualizaHorario(String nome, int dia, List<Horario> horarios){
        
    }

    public void atualizaPrecario(String nome, double p){
        
    }

}

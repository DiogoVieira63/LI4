package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;


public class GestaoCentroHistorico {
    private CentroHistoricoDAO centros;

    public GestaoCentroHistorico(Connection connection){
        this.centros = new CentroHistoricoDAO(connection);
    }

    public List<String> getKeys(){
        try{ return this.centros.getAllKeys(); }
        catch(SQLException e){ return new ArrayList<>();}
    }

    public List<Horario> getHorario(String nome){
        try{
            return centros.get(nome).getHorarios();
        } catch(Exception e) { return null; }
    }

    /*
    public Horario getHorario(String nome, int dia) {
        try {
            return centros.get(nome).getHorario(dia);
        } catch(Exception e) { return null; }
    }

     */


    public String getDescricao(String nome){
        try{
            return centros.get(nome).getDescricao();
        } catch(Exception e) { return null; }
    }

    public String getHiperligacao(String nome){
        try{
            return centros.get(nome).getSite();
        } catch(Exception e) { return null; }
    }

    public double getAvaliacao_geral(String nome){
        try{
            return centros.get(nome).getAvaliacao();
        } catch(Exception e) { return 0; }
    }

                 /*
    public List<Review> getListaAvaliacao(String nome){
        try{
            return centros.get(nome).getReviews();
        } catch(Exception e) { return null; }
    }


                  */
    public String getRua(String nome){
        try{
            return centros.get(nome).getRua();
        } catch(Exception e) { return null; }
    }

    /*
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

     */

    public Map<String,Localizacao> getLocalizacoes() throws SQLException {
        return centros.getLocalizacoes();
    }

    public CentroHistorico getCentro(String centro) throws SQLException {
        return centros.get(centro);
    }
}

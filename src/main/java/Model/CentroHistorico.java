package Model;

import java.util.*;

public class CentroHistorico {
    private String nome, descricao, site, rua;
    private double avaliacao;
    private Localizacao localizacao;
    private List<Horario> horario;
    private ReviewsDAO reviews ;

    public CentroHistorico(String nome, String descricao, String site, String rua, double avaliacao, Localizacao localizacao, List<Horario> horario, ReviewsDAO reviews) {
        this.nome = nome;
        this.descricao = descricao;
        this.site = site;
        this.rua = rua;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
        this.horario = horario;
        this.reviews = reviews;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Review> getReviews() {
        return reviews;
    }


    public String getRua(){
        return rua;
    }

    public void setHorario(Horario[] horario) {
        this.horario = horario;
    }


    public void setHorario(int dia, Horario horario){
        this.horario[dia] = horario;
    }

    public List<Horario> getHorarios() {
        List<Horario> lista = new ArrayList<>();
        for (Horario h : this.horario){
            lista.add(h);
        }
        return lista;
    }

    public Horario getHorario(int dia) {
        return horario[dia];
    }

    public double calcAvalGeral() {
        double d = 0;
        for (Review r : this.reviews){
            d += r.media();
        }
        return (d/this.reviews.size());
    }

    public void atualizaHorario(Horario[] horarioArray) {
        this.horario = horarioArray;
    }


    public void addReview(Review r){
        this.reviews.add(r);
    }

}

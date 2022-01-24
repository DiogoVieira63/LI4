package Model;

import java.sql.SQLException;
import java.util.*;

public class CentroHistorico {
    private String key, nome,rua;
    private double avaliacao;
    private Localizacao localizacao;
    private List<Horario> horario;
    private transient ReviewsDAO reviews ;

    public CentroHistorico(String key, String nome, String rua, double avaliacao, Localizacao localizacao, List<Horario> horario, ReviewsDAO reviews) {
        this.key = key;
        this.nome = nome;
        this.rua = rua;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
        this.horario = horario;
        this.reviews = reviews;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
       /*
    public List<Review> getReviews() {
        return reviews;
    }


        */

    public String getRua(){
        return rua;
    }
               /*
    public void setHorario(Horario[] horario) {
        this.horario = horario;
    }


    public void setHorario(int dia, Horario horario){
        this.horario[dia] = horario;
    }

                */

    public List<Horario> getHorarios() {
        List<Horario> lista = new ArrayList<>();
        for (Horario h : this.horario){
            lista.add(h);
        }
        return lista;
    }

    public MediaReviews getMediaReviews() throws SQLException {
        List<Review> reviewList = reviews.getReviewsCentro(key);
        double m_pres = 0, m_fa = 0,m_exp = 0,m_est = 0;
        for (Review review : reviewList){
            m_pres += review.getPreservacao();
            m_fa += review.getFacilidadeAcesso();
            m_exp += review.getExperiencia();
            m_est += review.getEstetica();
        }
        int len = reviewList.size();
        if (len > 0){
            m_pres=m_pres/len;
            m_fa= m_fa/len;
            m_est=m_est/len;
            m_exp=m_exp/len;
        }
        return new MediaReviews(m_pres,m_exp,m_fa,m_est);
    }

    /*
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

     */

}

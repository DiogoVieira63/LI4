import java.util.*;

public class CentroHistorico {
    String nome, descricao, site;
    double precario, avaliacao;

    List<Review> reveiws = new ArrayList<>();

    Horario[] horario = new Horario[7];

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

    public double getPrecario() {
        return precario;
    }

    public void setPrecario(double precario) {
        this.precario = precario;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Review> getReveiws() {
        return reveiws;
    }

    public void setReveiws(List<Review> reveiws) {
        this.reveiws = reveiws;
    }

    public Horario[] getHorario() {
        return horario;
    }

    public void setHorario(Horario[] horario) {
        this.horario = horario;
    }

}

import java.util.*;
import java.util.stream.Collectors;

public class Utilizador {
 
    private String nome = "", email = "", password = "", numTelefone = "";
    private boolean loggedIn = false;

    List<Notificacao> notificacao = new ArrayList<>();
    List<Review> reveiws = new ArrayList<>();

    List<CentroHistorico> historico = new ArrayList<>();
    
    public Utilizador(String nome, String password, String email){
        this.nome = nome;
        this.email = email;
        this.password = password;        
    }

    public Utilizador(String nome, String password, String email, String num_telefone){
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.numTelefone = num_telefone;        
    }

    public List<Notificacao> getNotificacoes(){
        return this.notificacao.stream().collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }


    public void setNotificacao(List<Notificacao> notificacao) {
        this.notificacao = notificacao;
    }

    public List<Review> getReveiws() {
        return reveiws;
    }

    public void setReveiws(List<Review> reveiws) {
        this.reveiws = reveiws;
    }

    public List<CentroHistorico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<CentroHistorico> historico) {
        this.historico = historico;
    }
}

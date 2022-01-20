package src;

import java.util.*;
import java.util.stream.Collectors;

public class Utilizador {
 
    private String nome = "";
    private String email = "";
    private String password = "";
    private String numTelefone = "";
    private boolean loggedIn = false;

    private List<Notificacao> notificacao = new ArrayList<>();

    private List<Review> avaliacoes = new ArrayList<>(); 

    private List<CentroHistorico> historico = new ArrayList<>();

    private List<ConfigNotificacoes> configuracoes = new ArrayList<>();
    
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
        return this.notificacao
            .stream()
            .collect(Collectors.toList());
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



    public List<Review> getReveiws() {
        return avaliacoes;
    }

    public void setReveiws(List<Review> reveiws) {
        this.avaliacoes = reveiws;
    }

    public List<CentroHistorico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<CentroHistorico> historico) {
        this.historico = historico;
    }

    public void recebeNotificacao(Notificacao n){
        this.notificacao.add(n);
    }

    public void addVisita(CentroHistorico visita){
        this.historico.add(visita);
    }

    public void eliminarNotificacoes(int id){
        for (Notificacao n : this.notificacao){
            if(n.getId() == id) this.notificacao.remove(n);
        }        
    }

    public void mudarPass(String pass){
        setPassword(password);
    }

    public void addReview(String nome, double eval_preservacao, double eval_experiencia, double eval_facilidade, double eval_estetica){
        Review r = new Review(eval_preservacao, eval_experiencia, eval_facilidade, eval_estetica);
        for(CentroHistorico ch : this.historico){
            if(ch.getNome().equals(nome)) ch.addReview(r);
        }
        this.avaliacoes.add(r);
    }

    public boolean validaRegisto(String email, String nome, String password){ 
        // ver na base de dados
        return (!this.email.equals(email) || !this.nome.equals(nome) || !this.password.equals(password));
    }

    public boolean validaRegisto(String email, String n_telemovel, String nome, String password){
        // ver na base de dados
        return (!this.email.equals(email) || !this.nome.equals(nome) || !this.password.equals(password) || !this.numTelefone.equals(n_telemovel));
    }
}

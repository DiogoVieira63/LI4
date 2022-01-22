package Model;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

public class Utilizador {
 
    private String nome = "";
    private String email = "";
    private String password = "";
    private String numTelefone = "";
    private boolean loggedIn = false;

    private ReviewsDAO avaliacoes;
    private VisitasDAO historico;

    public Utilizador(String nome, String email, String password, String numTelefone, boolean loggedIn) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.numTelefone = numTelefone;
        this.loggedIn = loggedIn;
    }

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

    public List<Review> getReveiws() throws SQLException {
        return avaliacoes.getReviewsUser(this.email);
    }

    public List<String> getHistorico() throws SQLException {
        return historico.getCentros(email);
    }

    public void addVisita(CentroHistorico visita) throws  SQLException{
        this.historico.addVisita(email,visita.getNome());
    }

    public void mudarPass(String pass){
        setPassword(password);
    }

    public void addReview(String nome, double eval_preservacao, double eval_experiencia, double eval_facilidade, double eval_es) throws SQLException{
        avaliacoes.doReview(email,nome,eval_preservacao, eval_experiencia, eval_facilidade, eval_es);
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

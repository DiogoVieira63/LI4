import java.util.*;

public class GuideMeTo implements IGuideMeToFacade{
    
    private GestaoUtilizador utilizadores = new GestaoUtilizador();
    private GestaoCentroHistorico centros = new GestaoCentroHistorico();

    public boolean registarUtilizador(String nome, String password, String email){
        return utilizadores.newUser(nome, password, email);
    }

    public boolean registarUtilizador(String nome, String password, String email, String n_telemovel){
        return utilizadores.newUser(nome, password, email, n_telemovel);
    }

    public boolean logIn(String email, String password){
        return utilizadores.logIn(email,password);
    }

    public boolean logOut(String email){
        return utilizadores.logOut(email);
    }

    public void configurarConta(){
 
    }

    public String getHiperligacao (String nomeCentro){ 
        return centros.getHiperligacao(nomeCentro); 
    }

    /*
    public List<Notificacao> getNotificacoes(String nome){
        return utilizadores.getNotificacoes(nome);
    }
    */
    
    public List<Notificacao> getNotificacoes(){
        return utilizadores.getAllNotificacoes();
    }

    public void configNotificacoes(int ID, boolean ativa){

    }

    public List<CentroHistorico> getCentroHistoricos(){
        return centros.getCentrosHistoricos();
    }

    public String enviaNotificacao(int id){
        return null;
    }

    
}

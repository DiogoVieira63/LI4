import java.util.ArrayList;
import java.util.List;

public class Utilizador {
 
    private String nome, email, password, numTelefone;
    private boolean loggedIn;

    List<Notificacao> notificacao = new ArrayList<>();
    List<Reveiw> reveiws = new ArrayList<>();

    List<CentroHistoricos> historico = new ArrayList<>();
}

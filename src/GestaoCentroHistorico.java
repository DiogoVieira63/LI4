import java.util.*;

public class GestaoCentroHistorico {
    private Map<String,CentroHistorico> centros = new HashMap();

    public String getSite(String nome) {
        try { 
            return centros.get(nome).getSite();
        }catch(NullPointerException e){ return null; }
    }
}

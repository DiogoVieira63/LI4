import java.util.List;

public class GuideMeTo implements IGuideMeToFacade {

	private IUtilizadorFacade modelUtilizador;
	private ICentroHistoricoFacade modelCentroHistorico;
	@Override
	public void registarUtilizador(String email, String nome, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registarUtilizador(String email, String nome, String n_telemovel, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean logIn(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void logOut(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void configurarConta() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getHiperligacao(String nomeCentro) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Notificacao> getNotificacoes() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void configNotificacoes(int ID, boolean ativa) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CentroHistorico> getCentrosHistoricos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String enviaNotificacao(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
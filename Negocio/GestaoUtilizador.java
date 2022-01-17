import java.util.List;

public class GestaoUtilizador implements IUtilizadorFacade {

	private UtilizadorDAO utilizadores;

	@Override
	public boolean validaRegisto(String email, String nome, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validaRegisto(String email, String nome, String n_telemovel, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validaLogIn(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enviaNotificacao(Notificacao n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logOut(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionaVisita(CentroHistorico visita) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> listarNotificacoes(String u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void configurarNotificacao(int IDNotificacao, boolean ativa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarNotificacoes(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configurarPassword(String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avaliar(String nome, Double eval_preservacao, Double eval_experiencia, Double eval_facilidade,
			Double eval_estetica) {
		// TODO Auto-generated method stub
		
	}

}
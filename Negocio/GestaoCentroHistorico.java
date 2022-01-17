import java.util.*;

public class GestaoCentroHistorico implements ICentroHistoricoFacade {

	private CentroHistoricoDAO centroshistoricos;

	@Override
	public List<Horario> getHorario(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Horario getHorario(String nome, int dia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrecario(String nome) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescricao(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHiperligacao(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getAvaliacao_geral(String nome) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AvaliacoesDadas> getListaAvaliacao(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRua(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizaHorario(String nome, int dia, Horario h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaHorario(String nome, List<Horario> horarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaPrecario(String nome, Double p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcAvalGeral(String nome) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
import java.util.*;

public interface ICentroHistoricoFacade {

	/**
	 * 
	 * @param nome
	 */
	List<Horario> getHorario(String nome);

	/**
	 * 
	 * @param nome
	 * @param dia
	 */
	Horario getHorario(String nome, int dia);

	/**
	 * 
	 * @param nome
	 */
	double getPrecario(String nome);

	/**
	 * 
	 * @param nome
	 */
	String getDescricao(String nome);

	/**
	 * 
	 * @param String
	 */
	String getHiperligacao(String nome);

	/**
	 * 
	 * @param nome
	 */
	double getAvaliacao_geral(String nome);

	/**
	 * 
	 * @param nome
	 */
	List<AvaliacoesDadas> getListaAvaliacao(String nome);

	/**
	 * 
	 * @param nome
	 */
	String getRua(String nome);

	/**
	 * 
	 * @param nome
	 * @param dia
	 * @param h
	 */
	void atualizaHorario(String nome, int dia, Horario h);

	/**
	 * 
	 * @param nome
	 * @param horarios
	 */
	void atualizaHorario(String nome, List<Horario> horarios);

	/**
	 * 
	 * @param nome
	 * @param p
	 */
	void atualizaPrecario(String nome, Double p);

	/**
	 * 
	 * @param nome
	 */
	double calcAvalGeral(String nome);

}
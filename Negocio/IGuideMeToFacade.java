import java.util.*;

public interface IGuideMeToFacade {

	/**
	 * 
	 * @param email
	 * @param nome
	 * @param password
	 */
	void registarUtilizador(String email, String nome, String password);

	/**
	 * 
	 * @param email
	 * @param nome
	 * @param n_telemovel
	 * @param password
	 */
	void registarUtilizador(String email, String nome, String n_telemovel, String password);

	/**
	 * 
	 * @param email
	 * @param password
	 */
	boolean logIn(String email, String password);

	/**
	 * 
	 * @param email
	 */
	void logOut(String email);

	void configurarConta();

	/**
	 * 
	 * @param nomeCentro
	 */
	String getHiperligacao(String nomeCentro);

	List<Notificacao> getNotificacoes();

	/**
	 * 
	 * @param ID
	 * @param ativa
	 */
	void configNotificacoes(int ID, boolean ativa);

	List<CentroHistorico> getCentrosHistoricos();

	/**
	 * 
	 * @param id
	 */
	String enviaNotificacao(int id);

}
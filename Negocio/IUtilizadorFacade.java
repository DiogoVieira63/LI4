import java.util.List;

public interface IUtilizadorFacade {

	/**
	 * 
	 * @param email
	 * @param nome
	 * @param password
	 */
	boolean validaRegisto(String email, String nome, String password);

	/**
	 * 
	 * @param email
	 * @param nome
	 * @param n_telemovel
	 * @param password
	 */
	boolean validaRegisto(String email, String nome, String n_telemovel, String password);

	/**
	 * 
	 * @param email
	 * @param password
	 */
	boolean validaLogIn(String email, String password);

	/**
	 * 
	 * @param n
	 */
	void enviaNotificacao(Notificacao n);

	/**
	 * 
	 * @param email
	 */
	void logOut(String email);

	/**
	 * 
	 * @param visita
	 */
	void adicionaVisita(CentroHistorico visita);

	/**
	 * 
	 * @param u
	 */
	List<String> listarNotificacoes(String u);

	/**
	 * 
	 * @param IDNotificacao
	 * @param ativa
	 */
	void configurarNotificacao(int IDNotificacao, boolean ativa);

	/**
	 * 
	 * @param id
	 */
	void eliminarNotificacoes(int id);

	/**
	 * 
	 * @param pass
	 */
	void configurarPassword(String pass);

	/**
	 * 
	 * @param nome
	 * @param eval_preservacao
	 * @param eval_experiencia
	 * @param eval_facilidade
	 * @param eval_estetica
	 */
	void avaliar(String nome, Double eval_preservacao, Double eval_experiencia, Double eval_facilidade, Double eval_estetica);

}
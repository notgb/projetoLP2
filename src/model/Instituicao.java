package model;
/**
 * Classe que representa o modelo de uma instituição
 * @author Gabriel e Alex
 */
public class Instituicao {
	private String codigoMEC;
	private String nome;
	private String anoFundacao;
	private String tipo;
	
	/**
	 * Construtor completo
	 * @param codigoMEC código MEC da instituição
	 * @param nome nome da instituição
	 * @param anoFundacao ano em que a instituição foi criada
	 * @param tipo tipo de instituição
	 */
	public Instituicao(String codigoMEC, String nome, String anoFundacao, String tipo) {
		this.codigoMEC = codigoMEC;
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.tipo = tipo;
	}
	
	/**
	 * Método para obter o código MEC da instituição
	 * @return codigoMEC
	 */
	public String getCodigoMEC() {
		return codigoMEC;
	}
	
	/**
	 * Método para definir o código MEC da instituição
	 * @param codigoMEC
	 */
	public void setCodigoMEC(String codigoMEC) {
		this.codigoMEC = codigoMEC;
	}

	/**
	 * Método para obter o nome da instituição
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método para definir o nome da instituição
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método para obter o ano em que a instituição foi criada
	 * @return anoFundacao
	 */
	public String getAnoFundacao() {
		return anoFundacao;
	}

	/**
	 * Método para definir o ano em que a instituição foi criada
	 * @param anoFundacao
	 */
	public void setAnoFundacao(String anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	/**
	 * Método para obter o tipo de instituição
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para definir o tipo de instituição
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

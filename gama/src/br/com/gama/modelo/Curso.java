package br.com.gama.modelo;

public class Curso {
	private String sigla;
	private String descricao;
	private boolean ativo;
	private float valor;
	private byte duracao;
	private float porcentagem;
	
	
	
	public Curso() {
		super();
	}

	public Curso(String sigla, String descricao, boolean ativo, float valor, byte duracao, float porcentagem) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
		this.ativo = ativo;
		this.valor = valor;
		this.duracao = duracao;
		this.porcentagem = porcentagem;
	}

	public float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public float atualizarValor() {
		valor = (porcentagem*valor/100)+valor;
				return valor;
		
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public byte getDuracao() {
		return duracao;
	}
	public void setDuracao(byte duracao) {
		this.duracao = duracao;
	}
	
	
	
	
	
	
}


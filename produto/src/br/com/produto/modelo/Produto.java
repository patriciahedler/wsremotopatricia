package br.com.produto.modelo;

public class Produto {

	private int id;
	private String descricao;
	private Fabricante fabricante;
	private float valorVenda;
	private float valorCompra;
	private int qte;
	private Venda venda;
	
	
	public Produto() {
		super();
	}


	public Produto(int id, String descricao, Fabricante fabricante, float valorVenda, float valorCompra, int qte) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qte = qte;
		this.venda = venda;
	}


	public Venda getVenda() {
		return venda;
	}


	public void setVenda(Venda venda) {
		this.venda = venda;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	public float getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}


	public float getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}


	public int getQte() {
		return qte;
	}


	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", fabricante=" + fabricante + ", valorVenda="
				+ valorVenda + ", valorCompra=" + valorCompra + ", qte=" + qte + ", venda=" + venda + "]";
	}


	public float totalEstoqueVenda() {
		
		return qte*valorVenda;
	}
	
	public float totalEstoqueCompra() {
		
		return qte*valorCompra;
	}
	
	public String verificarEstoque() {
		if(qte>15) {
		return "Estoque alto";
		} else if (qte<5) {
			return "Estoque baixo";
		}
		return "Estoque regular";
	}
	
	
	
	
	
	
}

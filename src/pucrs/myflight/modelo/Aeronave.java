package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	private Rota rota;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public int getCapacidade() {
		return capacidade;
	}

	public Rota getRota() {
		return rota;
	}
}

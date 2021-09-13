package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
	private ArrayList<Rota> rotas;
	
	public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

    public void AdicionarRotas (Rota rota){
		rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {
		return this.rotas;
	}

	public Rota buscarOrigem (Aeroporto origem) {
		for ( Rota rota : rotas ){

		if (rota.getOrigem().equals(origem)){
			return rota;
		}
		
	}
		return null;

	}

}
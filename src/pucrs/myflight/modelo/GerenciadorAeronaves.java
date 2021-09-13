package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> avioes;
	
	public GerenciadorAeronaves() {
		avioes = new ArrayList<>();
	}

	public void AdicionarAeronaves (Aeronave aviao){
		avioes.add(aviao);
	}

	public ArrayList<Aeronave> listarTodas() {
		return this.avioes;
	}

	public Aeronave buscarPorCodigo (String cod) {
		for ( Aeronave aviao : avioes ){

		if (aviao.getCodigo().equals(cod)){
			return aviao;
		}
		
	}
		return null;

	}
	

}

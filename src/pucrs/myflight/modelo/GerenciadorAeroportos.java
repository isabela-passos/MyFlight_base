package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos ;
	
	public GerenciadorAeroportos() {
		aeroportos = new ArrayList<>();
	}

	public void AdicionarAeroportos (Aeroporto aeroporto){
		aeroportos.add(aeroporto);
	}

	public ArrayList<Aeroporto> listarTodas() {
		return this.aeroportos;
	}

	public Aeroporto buscarPorCodigo (String cod) {
		for ( Aeroporto aeroporto : aeroportos ){

		if (aeroporto.getCodigo().equals(cod)){
			return aeroporto;
		}
		
	}
		return null;

	}
	

}
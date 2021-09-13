package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void AdicionarCias (CiaAerea empresa){
		empresas.add(empresa);
	}

	public ArrayList<CiaAerea> listarTodas() {
		return this.empresas;
	}

	public CiaAerea buscarPorCodigo (String cod) {
		for ( CiaAerea empresa : empresas ){

		if (empresa.getCodigo().equals(cod)){
			return empresa;
		}
		
	}
		return null;

	}

	public CiaAerea buscarPorNome (String nome) {
		for ( CiaAerea empresa : empresas ){

		if (empresa.getNome().equals(nome)){
			return empresa;
		}
		
	}
		return null;

	}

	//primeiro gerenciador que eu vou fazer
}

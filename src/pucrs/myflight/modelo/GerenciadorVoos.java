package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> flights;
   
	public GerenciadorVoos() {
		this.flights = new ArrayList<>();
	}

    public void AdicionarVoos (Voo flight){
		flights.add(flight);
	}

	public ArrayList<Voo> listarTodas() {
		return this.flights;
	}

	public Voo buscarData (LocalDateTime data) {
		for ( Voo flight : flights ){

		if (flight.getDatahora().equals(data)){
			return flight;
		}
		
	}
		return null;

	}


}

   





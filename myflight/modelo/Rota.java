package pucrs.myflight.modelo;

import java.time.LocalDateTime;

public class Rota {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(String codigo, Aeroporto origem2, Aeroporto destino2, Aeronave aeronave2, LocalDateTime dataHoraChegada,
			LocalDateTime dataHoraPartida, double distancia) {
		//TODO Auto-generated constructor stub
	}

    public Rota(String cia2, String origem2, String destino2, String aeronave2) {
		//TODO Auto-generated constructor stub
	}

	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}
}

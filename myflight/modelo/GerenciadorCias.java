package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;

public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

public void AdicionarCiaAerea (CiaAerea ciaAerea) {
		empresas.add(ciaAerea);
	}

public ArrayList<CiaAerea> ListarTodas () {
	return empresas; 
}
public CiaAerea BuscarCodigo (String codigo) {
	for (CiaAerea c : empresas) {
		if (c.getCodigo().equals(codigo)) {
			return c; 
		}
	}
	return null;
}
public CiaAerea BuscarNome (String nome) {
	for (CiaAerea c : empresas) {
		if (c.getNome().equals(nome)) {
			return c; 
		}
	}
	return null;
}
}



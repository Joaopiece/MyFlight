package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList <Rota> rota;

    public void AdicionarRota (Rota rota) {
    this.rota.add(rota);

}
public ArrayList<Rota> ListarTodas () {
    return rota;
}

public Rota BuscarPorOrigem (Aeroporto origem) {
    for(Rota r: rota) {
        if ( r.getOrigem().equals(origem)) {
            return r; 
        }
        }
        return null;
}
}



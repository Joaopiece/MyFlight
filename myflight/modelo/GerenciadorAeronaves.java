package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList <Aeronave> aeronave;

public void AdicionarAeronave (Aeronave aviao) {
    aeronave.add(aviao);
}
public ArrayList<Aeronave> ListarAeronaves() {
    return aeronave;
}
public Aeronave BuscarPorCodigo (String codigo) {
    for(Aeronave a : aeronave) {
        if (a.getCodigo().equals(codigo)) {
            return a;
        }
    }
    return null;

}
}





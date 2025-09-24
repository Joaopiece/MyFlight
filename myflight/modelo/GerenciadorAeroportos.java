package pucrs.myflight.modelo;
import java.util.ArrayList;
public class GerenciadorAeroportos {
    private ArrayList <Aeroporto> aeroporto;

public void AdicionarAeroporto (Aeroporto aeroporto) {
    this.aeroporto.add(aeroporto);
}
public ArrayList<Aeroporto> ListarTodos () {
    return aeroporto;
}
public Aeroporto BuscarPorCodigo (String codigo) {
    for (Aeroporto b : aeroporto) {
         if (b.getCodigo().equals(codigo)) {
            return b;
        }
    }
    return null;
    }
}


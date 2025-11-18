package pucrs.myflight.modelo;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList <Voo> voos;
    public void AdicionarVoo (Voo voo) {
        this.voos.add(voo); 
    }

    public GerenciadorVoos() {
        this.voos = new ArrayList<>();
    }

    public ArrayList<Voo> ListarTodos () {
        return voos;
    }
    
    public ArrayList<Voo> BuscarData (LocalDate data) {
        ArrayList<Voo> voosEncontrados = new ArrayList<>();
            for(Voo v : voos) {
            if (v.getDatahora().toLocalDate().equals(data)) {
                voosEncontrados.add(v); 
            }
        }
        if (voosEncontrados.isEmpty()) {
            return null;
        } else {
            return voosEncontrados;
        }
    }
}


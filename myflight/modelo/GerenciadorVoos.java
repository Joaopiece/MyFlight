package pucrs.myflight.modelo;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList <Voo> voo;
    public void AdicionarVoo (Voo voo) {
        this.voo.add(voo); 
    }
    public ArrayList<Voo> ListarTodos () {
        return voo;
    }
    public ArrayList<Voo> BuscarData (LocalDate data) {
        for(Voo v: voo) {
            if (v.getData().equals(data)) {
                return voo; 
            }
        }
        return null;
    }
}

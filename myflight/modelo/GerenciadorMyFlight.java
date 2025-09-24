package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class GerenciadorMyFlight {
    private List<CiaAerea> ciasAereas;
    private List<Aeroporto> aeroportos;
    private List<Rota> rotas;
    private List<Voo> voos;
    private List<Aeronave> aeronaves;

    public GerenciadorMyFlight() {
        this.ciasAereas = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
        this.aeroportos = new ArrayList<>();
        this.rotas = new ArrayList<>();
        this.voos = new ArrayList<>();
    }

    public void cadastrarCompanhiaAerea(String codigo, String nome) {
        ciasAereas.add(new CiaAerea(codigo, nome));
    }

    public void cadastrarAeronave(String codigo, String descricao) {
        aeronaves.add(new Aeronave(codigo, descricao));
    }

    public void cadastrarAeroporto(String codigo, String nome, double latitude, double longitude) {
        aeroportos.add(new Aeroporto(codigo, nome, new Geo(latitude, longitude)));
    }

    public void cadastrarRota(String cia, String origem, String destino, String aeronave) {
        rotas.add(new Rota(cia, origem, destino, aeronave)); 
    }

    public void criarVoo(Rota rota, LocalDateTime datahora, Duration duracao) {
        voos.add(new Voo(rota, datahora, duracao)); 
        System.out.println("INFO: Voo criado com sucesso!");
    }
    
    public CiaAerea buscarCiaAerea(String codigo) {
        for (CiaAerea c : ciasAereas) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public Aeroporto buscarAeroporto(String codigo) {
        for (Aeroporto a : aeroportos) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) return a;
        }
        return null;
    }

    public Aeronave buscarAeronave(String codigo) {
        for (Aeronave a : aeronaves) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) return a;
        }
        return null;
    }
    
    public Rota buscarRota(String codCia, String codOrigem, String codDestino) {
        for(Rota r : rotas) {
            if(r.getCia().getCodigo().equalsIgnoreCase(codCia) &&
               r.getOrigem().getCodigo().equalsIgnoreCase(codOrigem) &&
               r.getDestino().getCodigo().equalsIgnoreCase(codDestino)) {
                return r;
            }
        }
        return null;
    }
    
    public void listarTodasAsRotas() {
        System.out.println("\n--- LISTA DE TODAS AS ROTAS ---");
        rotas.forEach(System.out::println);
    }

    public void criarVoo(String string, String string2, String string3, LocalDateTime dataVoo1, Duration duracaoVoo1) {
        throw new UnsupportedOperationException("Unimplemented method 'criarVoo'");
    }
}
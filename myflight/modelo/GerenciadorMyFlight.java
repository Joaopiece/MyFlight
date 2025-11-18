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

    public void cadastrarRota(String codCia, String codOrigem, String codDestino, String codAeronave) {
        CiaAerea cia = buscarCiaAerea(codCia);
        Aeroporto origem = buscarAeroporto(codOrigem);
        Aeroporto destino = buscarAeroporto(codDestino);
        Aeronave aeronave = buscarAeronave(codAeronave);
        
        if (cia != null && origem != null && destino != null && aeronave != null) {
            Rota rota = new Rota(cia, origem, destino, aeronave);
            rotas.add(rota);
            System.out.println("INFO: Rota cadastrada com sucesso!");
        } else {
            System.out.println("ERRO: Não foi possível cadastrar a rota. Verifique os códigos informados.");
        }
    }

    public void criarVoo(String codCia, String codOrigem, String codDestino, LocalDateTime dataHora, Duration duracao) {
        Rota rota = buscarRota(codCia, codOrigem, codDestino);
        if (rota != null) {
            Voo voo = new Voo(rota, dataHora, duracao);
            voos.add(voo);
            System.out.println("INFO: Voo criado com sucesso!");
        } else {
            System.out.println("ERRO: Não foi possível criar o voo. Verifique os códigos informados.");
        }
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
}
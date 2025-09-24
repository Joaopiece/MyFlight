package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;

public class AppFlight {

    public static void main(String[] args) {
        GerenciadorMyFlight gerenciador = new GerenciadorMyFlight();

        System.out.println("--- Iniciando cadastros do sistema MyFlight ---");

        gerenciador.cadastrarCompanhiaAerea("G3", "GOL Linhas Aéreas");
        gerenciador.cadastrarCompanhiaAerea("AD", "Azul Linhas Aéreas");

        gerenciador.cadastrarAeronave("PR-GOL", "Boeing 737 MAX");
        gerenciador.cadastrarAeronave("PR-AJA", "Airbus A320neo");

        gerenciador.cadastrarAeroporto("POA", "Aeroporto Salgado Filho", -29.9939, -51.1714);
        gerenciador.cadastrarAeroporto("GRU", "Aeroporto de Guarulhos", -23.4356, -46.4731);
        gerenciador.cadastrarAeroporto("SDU", "Aeroporto Santos Dumont", -22.9105, -43.1631);

        System.out.println("\n--- Cadastrando rotas ---");
        
        gerenciador.cadastrarRota("G3", "POA", "GRU", "PR-GOL");
        gerenciador.cadastrarRota("AD", "GRU", "SDU", "PR-AJA");
        
        gerenciador.cadastrarRota("TP", "POA", "SDU", "PR-AJA");

        System.out.println("\n--- Criando voos específicos ---");

        LocalDateTime dataVoo1 = LocalDateTime.of(2025, 12, 25, 10, 30);
        Duration duracaoVoo1 = Duration.ofMinutes(95); 
        gerenciador.criarVoo("G3", "POA", "GRU", dataVoo1, duracaoVoo1);

        LocalDateTime dataVoo2 = LocalDateTime.of(2025, 12, 31, 20, 00);
        Duration duracaoVoo2 = Duration.ofMinutes(55);
        gerenciador.criarVoo("AD", "GRU", "SDU", dataVoo2, duracaoVoo2);
        
    }
}
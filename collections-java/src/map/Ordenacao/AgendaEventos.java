package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap; // Mapeia datas para eventos
  
    public AgendaEventos() {
      this.eventosMap = new HashMap<>(); // Inicializa o mapa de eventos
    }
  
    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
      eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao)); // Adiciona um evento com a data como chave
    }
  
    public void exibirAgenda() {
      // Ordena os eventos por data usando TreeMap
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
      // Itera pelos eventos ordenados
      for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
        LocalDate dataEvento = entry.getKey();
        Evento evento = entry.getValue();
        // Exibe a data e detalhes do evento
        System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
      }
    }
  
    public void obterProximoEvento() {
      LocalDate dataAtual = LocalDate.now(); // Data atual
      LocalDate proximaData = null;
      Evento proximoEvento = null;
      // Itera pelos eventos para encontrar o próximo evento
      for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
        LocalDate dataEvento = entry.getKey();
        // Verifica se o evento é hoje ou no futuro
        if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
          proximaData = dataEvento;
          proximoEvento = entry.getValue();
          break; // Encontra o próximo evento e sai do loop
        }
      }
      // Exibe o próximo evento ou uma mensagem se não houver eventos futuros
      if (proximoEvento != null) {
        System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
      } else {
        System.out.println("Não há eventos futuros na agenda.");
      }
    }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }
}

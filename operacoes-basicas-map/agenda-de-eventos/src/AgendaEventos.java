import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 1. Agenda de Eventos
 *
 * Crie uma classe chamada "AgendaEventos" que utilize um `Map`
 * para armazenar as datas e seus respectivos Eventos. Cada
 * evento é representado por um objeto da classe "Evento", que
 * possui atributos como nome do evento e o nome da atração.
 *
 * Implemente os seguintes métodos:
 *
 * adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
 * exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
 * obterProximoEvento(): Retorna o próximo evento que ocorrerá.

 */
public class AgendaEventos {
  private Map<LocalDate, Evento> agenda;

  public AgendaEventos() {
    this.agenda = new HashMap<LocalDate, Evento>();
  }

  /**
   * Adiciona um evento à agenda.
   * @param data
   * @param nome
   * @param atracao
   */
  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    agenda.put(data, evento);
  }

  /**
   * Exibe a agenda de eventos em ordem crescente de data.
   */
  public void exibirAgenda() {
    System.out.println(" - Exibir Agenda\n");
    Set<LocalDate> datas = new HashSet<LocalDate>(agenda.keySet());
    for (LocalDate data : datas) {
      System.out.println(data + " - " + agenda.get(data));
    }
  }

  /**
   * Retorna o próximo evento que ocorrerá.
   */
  public void obterProximoEvento() {
    System.out.println(" - Próximo evento");
    LocalDate diaAtual = LocalDate.now();
    Evento proximoEvento = null;
    LocalDate proximaData = null;
    Map<LocalDate, Evento> orderedAgenda = new TreeMap<LocalDate, Evento>(agenda);
    for (LocalDate date : orderedAgenda.keySet()) {
      if (date.isAfter(diaAtual)) {
        proximoEvento = agenda.get(date);
        proximaData = date;
        break;
      }
    }
    System.out.println(proximaData + " - " + proximoEvento);
  }

}

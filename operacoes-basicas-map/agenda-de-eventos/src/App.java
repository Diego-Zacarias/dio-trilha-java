import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 25), "Aniversário da cidade", "Teatro mágico");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 2), "Congresso de direito", "Grupo de Jazz");
        agenda.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 15), "Congresso de medicina", "Palestras");
        agenda.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 24), "Inauguração da escola", "Banda marcial");
        agenda.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 5), "Inauguração da ponte", "Discurso do prefeito");
        agenda.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 13), "Festival da colheita", "Grupo de música local");
        agenda.adicionarEvento(LocalDate.of(2025, Month.MAY, 11), "Festival de outono", "Orquestra de cordas");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }
}

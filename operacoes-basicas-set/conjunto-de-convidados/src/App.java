public class App {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("con1", 1);
        convidados.adicionarConvidado("con2", 2);
        convidados.adicionarConvidado("con3", 3);
        convidados.adicionarConvidado("con4", 4);
        convidados.adicionarConvidado("con5", 5);
        convidados.adicionarConvidado("con6", 6);
        convidados.adicionarConvidado("con7", 7);

        convidados.contarConvidados();

        convidados.removerConvidadoPorCodigoConvite(5);

        convidados.exibirConvidados();

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("maria", 12344321);
        agenda.adicionarContato("joao", 43211234);
        agenda.adicionarContato("jose", 32144321);
        agenda.adicionarContato("clara", 111222333);
        agenda.adicionarContato("miguel", 444333222);
        agenda.adicionarContato("juliana", 11224433);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("juliana");

        agenda.atualizarNumeroContato("maria", 0);

        agenda.exibirContatos();
        
    }
}

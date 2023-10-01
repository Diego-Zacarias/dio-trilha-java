public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatosMap agenda = new AgendaContatosMap();

        agenda.adicionarContato("diego", 123);
        agenda.adicionarContato("quezia", 456);
        agenda.adicionarContato("thiago", 789);
        agenda.adicionarContato("juliana", 987);
        agenda.adicionarContato("pedro", 654);
        agenda.adicionarContato("ester", 321);
        System.out.println("--------");
        agenda.exibirContatos();
        System.out.println("--------");
        agenda.pesquisarPorNome("ester");
        System.out.println("--------");
        agenda.removerContato("pedro");
        System.out.println("--------");
        agenda.exibirContatos();
    }
}

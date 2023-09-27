public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("limpar");
        lista.adicionarTarefa("cozinhar");
        lista.adicionarTarefa("arrumar");
        lista.adicionarTarefa("trabalhar");
        lista.adicionarTarefa("sair");
        lista.adicionarTarefa("dormir");
        lista.adicionarTarefa("acordar");

        lista.contarTarefas();

        lista.marcarTarefaConcluida("limpar");
        lista.marcarTarefaConcluida("arrumar");
        lista.marcarTarefaConcluida("sair");
        lista.marcarTarefaConcluida("acordar");
        lista.marcarTarefaConcluida("dormir");

        lista.exibirTarefas();

        lista.marcarTarefaPendente("limpar");

        lista.exibirTarefas();

        lista.limparListaTarefas();

        lista.exibirTarefas();
    }
}

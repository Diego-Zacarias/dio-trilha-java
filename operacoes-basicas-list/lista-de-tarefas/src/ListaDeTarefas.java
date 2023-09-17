import java.util.ArrayList;
import java.util.List;

/*
 *  Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
 *  Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição.
 *
 *  -> Implemente os seguintes métodos:
 *
 *  adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
 *  removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
 *  obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
 *  obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 *
 */

public class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> remover = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                remover.add(tarefa);
            }
        }
        this.tarefas.removeAll(remover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(this.tarefas.toString());
    }

    public static void main(String[] args) {
        ListaDeTarefas lista = new ListaDeTarefas();

        System.out.println(lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Criar planilha");
        lista.adicionarTarefa("Limpar hd");

        System.out.println(lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();

        lista.removerTarefa("Limpar hd");

        lista.obterDescricoesTarefas();

    }

}

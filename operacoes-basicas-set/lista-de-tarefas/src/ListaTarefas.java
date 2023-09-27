import java.util.HashSet;
import java.util.Set;

/**
 * 2. Lista de Tarefas
 * Crie uma classe chamada "ListaTarefas" que
 * possui um conjunto de objetos do tipo "Tarefa"
 * como atributo. Cada tarefa possui um atributo
 * de descrição e um atributo booleano para indicar
 * se a tarefa foi concluída ou não.
 *
 * Implemente os seguintes métodos:
 * adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
 * removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
 * exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
 * contarTarefas(): Conta o número total de tarefas na lista de tarefas.
 * obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
 * obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
 * marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
 * marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
 * limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */

public class ListaTarefas {
  private Set<Tarefa> lista;

  public ListaTarefas() {
    this.lista = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) { //: Adiciona uma nova tarefa ao Set.
    lista.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {//: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    Tarefa remover = null;
    for (Tarefa tarefa : lista) {
      if (tarefa.getDescricao().equals(descricao)) {
        remover = tarefa;
        break;
      }
    }
    lista.remove(remover);
  }

  public void exibirTarefas() {//: Exibe todas as tarefas da lista de tarefas.
    System.out.println(lista);
  }

  public void contarTarefas() {//: Conta o número total de tarefas na lista de tarefas.
    System.out.println(lista.size());
  }

  public void obterTarefasConcluidas() {//: Retorna um Set com as tarefas concluídas.
    System.out.println("TAREFAS CONCLUÍDAS\n");
    for (Tarefa tarefa : lista) {
      if (tarefa.getConcluido()) {
        System.out.println(tarefa.toString());
      }
    }
  }

  public void obterTarefasPendentes() {//: Retorna um Set com as tarefas pendentes.
    System.out.println("TAREFAS PENDENTES\n");
    for (Tarefa tarefa : lista) {
      if (!tarefa.getConcluido()) {
        System.out.println(tarefa.toString());
      }
    }
  }
  public void marcarTarefaConcluida(String descricao) {//: Marca uma tarefa como concluída de acordo com a descrição.
    Tarefa concluida = null;
    for (Tarefa tarefa : lista) {
      if (tarefa.getDescricao().equals(descricao)) {
        tarefa.setConcluido(true);
        concluida = tarefa;
      }
    }
    System.out.println("Concluida -> " + concluida);
  }
  public void marcarTarefaPendente(String descricao) {//: Marca uma tarefa como pendente de acordo com a descrição.
    Tarefa pendente = null;
    for (Tarefa tarefa : lista) {
      if (tarefa.getDescricao().equals(descricao)) {
        tarefa.setConcluido(false);
        pendente = tarefa;
      }
    }
    System.out.println("Pendente -> " + pendente);
  }
  public void limparListaTarefas() {//: Remove todas as tarefas da lista de tarefas.
    lista.clear();
    System.out.println("Lista de tarefas apagada");
  }
}

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Agenda de Contatos
 * Crie uma classe chamada "AgendaContatos" que possui
 * um conjunto de objetos do tipo "Contato" como atributo.
 * Cada contato possui atributos como nome e número de telefone.
 *
 * Implemente os seguintes métodos:
 * adicionarContato(String nome, int numero): Adiciona um contato à agenda.
 * exibirContatos(): Exibe todos os contatos da agenda.
 * pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
 * atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.
 */

public class AgendaContatos {
  private Set<Contato> agenda;

  public AgendaContatos() {
    this.agenda = new HashSet<Contato>();
  }

public void adicionarContato(String nome, int numero) {
  this.agenda.add(new Contato(nome, numero));
}

public void exibirContatos() {
  for (Contato contato : agenda) {
    System.out.println(contato.getNome() + " \t" + contato.getNumero());
  }
}

  public void pesquisarPorNome(String nome) {
    Set<Contato> contatos = new HashSet<Contato>();
    for (Contato contato : agenda) {
      if (contato.getNome().startsWith(nome)) {
        contatos.add(contato);
      }
    }
    for (Contato contato : contatos) {
      System.out.println(contato.getNome() + " \t" + contato.getNumero());
    }
  }

  public void atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for (Contato contato : agenda) {
      if (contato.getNome().equals(nome)) {
        contato.setNumero(novoNumero);
        contatoAtualizado = contato;
        break;
      }
    }
    System.out.println(contatoAtualizado.getNome() + " \t" + contatoAtualizado.getNumero());
  }
}

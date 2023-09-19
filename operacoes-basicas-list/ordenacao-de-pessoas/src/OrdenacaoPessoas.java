import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Ordenação de Pessoas
 * Crie uma classe chamada "OrdenacaoPessoas"
 * que possui uma lista de objetos do tipo
 * "Pessoa" como atributo. Cada pessoa possui
 * atributos como nome, idade e altura.
 *
 * Implemente os seguintes métodos:
 * adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
 * ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
 * ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
 */

public class OrdenacaoPessoas {
  List<Pessoa> pessoas;

  public OrdenacaoPessoas() {
    pessoas = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(this.pessoas);
    Collections.sort(pessoasPorIdade);

    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(this.pessoas);

    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

    return pessoaPorAltura;
  }
}

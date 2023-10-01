import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 2. Dicionário
 *
 * Crie uma classe chamada "Dicionario" que utilize um Map
 * para armazenar palavras e suas respectivas definições.
 *
 * Implemente os seguintes métodos:
 * adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
 * removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
 * exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
 * pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
 */

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  /**
   * Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
   * @param palavra
   * @param definicao
   */
  public void adicionarPalavra(String palavra, String definicao) {
    this.dicionario.put(palavra, definicao);
  }

  /**
   * Remove uma palavra do dicionário, dado o termo a ser removido.
   * @param palavra
   */
  public void removerPalavra(String palavra) {
    this.dicionario.remove(palavra);
  }

  /**
   * Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
   */
  public void exibirPalavras() {
    Set<String> palavras = new TreeSet<String>(this.dicionario.keySet());

    for (String palavra : palavras) {
      System.out.println(palavra + ": " + dicionario.get(palavra));
    }
  }

  /**
   * Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
   * @param palavra
   */
  public void pesquisarPorPalavra(String palavra) {
    System.out.println(palavra + ": " + this.dicionario.get(palavra));
  }
}

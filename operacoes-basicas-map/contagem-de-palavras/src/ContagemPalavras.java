import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 2. Contagem de Palavras
 *
 * Crie uma classe chamada "ContagemPalavras" que utilize um Map
 * para armazenar as palavras e a quantidade de vezes que cada
 * palavra aparece em um texto.
 *
 * Implemente os seguintes métodos:
 * adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
 * removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
 * exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
 * encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
 */
public class ContagemPalavras {
  private Map<String, Integer> palavras;

  public ContagemPalavras() {
    this.palavras = new HashMap<String, Integer>();
  }

  /**
   * Adiciona uma palavra à contagem.
   * @param palavra
   * @param contagem
   */
  public void adicionarPalavra(String palavra, Integer contagem) {
    palavras.put(palavra, contagem);
  }

  /**
   * Remove uma palavra da contagem, se estiver presente.
   * @param palavra
   */
  public void removerPalavra(String palavra) {
    palavras.remove(palavra);
  }

  /**
   * Exibe todas as palavras e suas respectivas contagens.
   */
  public void exibirContagemPalavras() {
    Set<String> keys = new HashSet<String>(palavras.keySet());
    for (String key : keys) {
      System.out.println(key + ": " + palavras.get(key));
    }
  }

  /**
   * Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
   */
  public void encontrarPalavraMaisFrequente() {
    Integer maior = Integer.MIN_VALUE;
    String palavra = null;
    Set<String> keys = new HashSet<String>(palavras.keySet());
    for (String key : keys) {
        if (maior<palavras.get(key)) {
          maior = palavras.get(key);
          palavra = key;
        }
    }
    System.out.println(palavra + " contagem: " + maior);
  }

}

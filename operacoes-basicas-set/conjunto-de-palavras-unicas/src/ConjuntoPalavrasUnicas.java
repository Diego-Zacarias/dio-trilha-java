import java.util.HashSet;
import java.util.Set;

/**
 * 2. Conjunto de Palavras Únicas
 *
 * Crie uma classe chamada "ConjuntoPalavrasUnicas"
 * que possui um conjunto de palavras únicas como
 * atributo.
 *
 * Implemente os seguintes métodos:
 * adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
 * removerPalavra(String palavra): Remove uma palavra do conjunto.
 * verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
 * exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */

public class ConjuntoPalavrasUnicas {
  private Set<String> palavras;

  public ConjuntoPalavrasUnicas() {
    this.palavras = new HashSet<String>();
  }

  public void adicionarPalavra(String palavra) {
    this.palavras.add(palavra);
  }

  public void removerPalavra(String palavra) {
    palavras.remove(palavra);
  }

  public void verificarPalavra(String palavra) {
    System.out.println(palavras.contains(palavra));
  }

  public void exibirPalavrasUnicas() {
    palavras.forEach(System.out::println);
  }
}

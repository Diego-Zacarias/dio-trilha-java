import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Cadastro de Produtos
 *
 * Crie uma classe chamada "CadastroProdutos" que
 * possui um conjunto de objetos do tipo "Produto"
 * como atributo. Cada produto possui atributos como
 * nome, cod, preço e quantidade.
 *
 * Implemente os seguintes métodos:
 *
 * adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
 * exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
 * exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
 */

public class CadastroProdutos {
  private Set<Produto> produtos;

  public CadastroProdutos() {
    this.produtos = new HashSet<>();
  }
  /**
   * : Adiciona um produto ao cadastro.
   * @param cod
   * @param nome
   * @param preco
   * @param quantidade
   */
  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtos.add(new Produto(cod, nome, preco, quantidade));
  }

  /**
   * : Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
   */
  public void exibirProdutosPorNome() {
    List<Produto> sortedByNome = new ArrayList<Produto>(this.produtos);
    Collections.sort(sortedByNome);

    for (Produto produto : sortedByNome) {
      System.out.println(produto);
    }
  }

  /**
   * : Exibe todos os produtos do cadastro em ordem crescente de preço.
   */
  public void exibirProdutosPorPreco() {
    Set<Produto> sortedByPreco = new TreeSet<Produto>(new ComparatorPorPreco());
    sortedByPreco.addAll(produtos);

    for (Produto produto : sortedByPreco) {
      System.out.println(produto);
    }
  }
}

/**
 * ComparatorPorPreco implements Comparator<Produto>
 */
class ComparatorPorPreco implements Comparator<Produto> {
  @Override
  public int compare(Produto arg0, Produto arg1) {
    return Double.compare(arg0.getPreco(), arg1.getPreco());
  }
}

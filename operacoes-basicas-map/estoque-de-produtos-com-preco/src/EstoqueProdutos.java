import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1. Estoque de Produtos com Preço
 *
 * Crie uma classe chamada "EstoqueProdutos" que utilize um Map
 * para armazenar os produtos, suas quantidades em estoque e seus
 * respectivos preços. Cada produto possui um código como chave
 * e um objeto Produto como valor, contendo nome, quantidade e preço.
 *
 * Implemente os seguintes métodos:
 * adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
 * exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
 * calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
 * obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
 * obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
 * obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
 */
public class EstoqueProdutos {
  Map<String, Produto> produtos;

  public EstoqueProdutos() {
    this.produtos = new HashMap<>();
  }

  /**
   * Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
   * @param cod
   * @param nome
   * @param quantidade
   * @param preco
   */
  public void adicionarProduto(String cod, String nome, int quantidade, double preco) {
    Produto produto = new Produto(nome, quantidade, preco);
    produtos.put(cod, produto);
  }

  /**
   * Exibe todos os produtos, suas quantidades em estoque e preços.
   */
  public void exibirProdutos() {
    Set<String> cods = new HashSet<>(this.produtos.keySet());
    for (String cod : cods) {
      System.out.println("cod: " + cod + produtos.get(cod));
    }
  }

  /**
   * Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
   */
  public void calcularValorTotalEstoque() {
    double total = 0;
    for (Produto produto : produtos.values()) {
      total = total + produto.getPreco() * produto.getQuantidade();
    }

    System.out.println("Total: R$ " + total);
  }

  /**
   * Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
   */
  public void obterProdutoMaisCaro() {
    Produto maisCaro = null;
    Double maiorPreco = Double.MIN_VALUE;
    for (Produto produto : produtos.values()) {
      if (maiorPreco < produto.getPreco()) {
        maiorPreco = produto.getPreco();
        maisCaro = produto;
      }
    }
    System.out.println("Mais caro ->> " + maisCaro);
  }

  /**
   * Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
   */
  public void obterProdutoMaisBarato() {
    Produto maisBarato = null;
    Double menorPreco = Double.MAX_VALUE;
    for (Produto produto : produtos.values()) {
      if (menorPreco > produto.getPreco()) {
        menorPreco = produto.getPreco();
        maisBarato = produto;
      }
    }
    System.out.println("Mais barato ->> " + maisBarato);
  }

  /**
   * Retorna o produto que está em maior quantidade no estoque,
   * considerando o valor total de cada produto (quantidade * preço).
   */
  public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto maiorQuantidade = null;
    int maior = Integer.MIN_VALUE;
    for (Produto produto : produtos.values()) {
      if (maior < produto.getQuantidade()) {
        maior = produto.getQuantidade();
        maiorQuantidade = produto;
      }
    }
    System.out.println("Maior quantidade ->> " + maiorQuantidade);
  }
}

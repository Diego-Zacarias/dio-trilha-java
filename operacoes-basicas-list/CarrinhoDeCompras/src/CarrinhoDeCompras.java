import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online.
 * O carrinho deve ser implementado como uma lista de itens.
 * Cada item é representado por uma classe chamada "Item"
 * que possui atributos como nome, preço e quantidade.
 *
 * Implemente os seguintes métodos:
 * adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
 * removerItem(String nome): Remove um item do carrinho com base no seu nome.
 * calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
 * exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */

public class CarrinhoDeCompras {
  List<Item> items;

  public CarrinhoDeCompras() {
    this.items = new ArrayList<>();
  }
  
  public void adicionarItem(String nome, double preco, int quantidade) {
    this.items.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> remover = new ArrayList<>();
    for (Item item : this.items) {
      if (item.getNome().equalsIgnoreCase(nome)) {
        remover.add(item);
      }
    }
    this.items.removeAll(remover);
  }

  public double calcularValorTotal() {
    double total = 0;

    for (Item item : this.items) {
      total = total + item.getPreco() * item.getQuantidade();
    }

    return total;
  }

  public void exibirItens() {
    for (Item item : this.items) {
      System.out.println("nome: " + item.getNome() + "\tpreço: " + item.getPreco() + "\tquantidade: " + item.getQuantidade());
    }
  }
}

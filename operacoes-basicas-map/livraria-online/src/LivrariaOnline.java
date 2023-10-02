import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 2. Livraria Online
 *
 * Crie uma classe chamada "LivrariaOnline" que representa uma
 * livraria online. Essa classe utiliza um Map para armazenar
 * os livros disponíveis na livraria, utilizando o link da obra
 * na Amazon Marketplace como chave e um objeto da classe
 * "Livro" como valor. A classe "Livro" possui atributos como
 * título, autor e preço. Através da classe "LivrariaOnline",
 *
 * implemente os seguintes métodos:
 * adicionarLivro(String link, String titulo, String autor, double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
 * removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
 * exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
 * pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
 * obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
 * exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
 */
public class LivrariaOnline {
  private Map<String, Livro> catalogo;

  public LivrariaOnline() {
    this.catalogo = new HashMap<String, Livro>();
  }

  /**
   * Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
   * @param link
   * @param titulo
   * @param autor
   * @param preco
   */
  public void adicionarLivro(String link, String titulo, String autor, double preco) {
    Livro livro = new Livro(titulo, autor, preco);
    catalogo.put(autor, livro);
  }

  /**
   * Remove um livro da livraria, dado o titulo do livro.
   * @param titulo
   */
  public void removerLivro(String titulo) {
    Map<String, Livro> remover = new HashMap<String, Livro>();
    for (String link : catalogo.keySet()) {
      if (catalogo.get(link).getTitulo().equals(titulo)) {
        remover.put(link, catalogo.get(link));
      }
    }
    for (String link : remover.keySet()) {
      catalogo.remove(link);
    }
    System.out.println(titulo + " - livro(s) removido(s)!");
  }

  /**
   * Exibe os livros da livraria em ordem crescente de preço.
   */
  public void exibirLivrosOrdenadosPorPreco() {
    System.out.println("Livros ordenador por preço\n");
    List<Map.Entry<String, Livro>> livrosDesordenados = new ArrayList<>(catalogo.entrySet());
    Collections.sort(livrosDesordenados, new SortByPrice());
    Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

    for (Map.Entry<String,Livro> entry : livrosDesordenados) {
      livrosOrdenados.put(entry.getKey(), entry.getValue());
    }

    for (String link : livrosOrdenados.keySet()) {
      System.out.println(link + " - " + livrosOrdenados.get(link));
    }
  }

  /**
   * Retorna uma lista de todos os livros escritos por um determinado autor.
   * @param autor
   */
  public void pesquisarLivrosPorAutor(String autor) {
    System.out.println("Livros filtrados por autor\n");
    for (String link : catalogo.keySet()) {
      if (catalogo.get(link).getAutor().equals(autor)) {
        System.out.println(catalogo.get(link));
      }
    }
  }

  /**
   * Retorna o livro mais caro disponível na livraria.
   */
  public void obterLivroMaisCaro() {
    System.out.println("Livro mais caro\n");
    Livro livroMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (String link : catalogo.keySet()) {
      if (catalogo.get(link).getPreco() > maiorPreco) {
        livroMaisCaro = catalogo.get(link);
        maiorPreco = catalogo.get(link).getPreco();
      }
    }
    System.out.println(livroMaisCaro);
  }

  /**
   * Retorna o livro mais barato disponível na livraria.
   */
  public void exibirLivroMaisBarato() {
        System.out.println("Livro mais barato\n");
    Livro livroMaisCaro = null;
    double maiorPreco = Double.MAX_VALUE;
    for (String link : catalogo.keySet()) {
      if (catalogo.get(link).getPreco() < maiorPreco) {
        livroMaisCaro = catalogo.get(link);
        maiorPreco = catalogo.get(link).getPreco();
      }
    }
    System.out.println(livroMaisCaro);
  }
  
}

/**
 * SortByPrice
 */
class SortByPrice implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Entry<String, Livro> arg0, Entry<String, Livro> arg1) {
    return Double.compare(arg0.getValue().getPreco(), arg1.getValue().getPreco());
  }
}

class SortByAuthor implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Entry<String, Livro> arg0, Entry<String, Livro> arg1) {
    return arg0.getValue().getAutor().compareToIgnoreCase(arg1.getValue().getAutor());
  }
}

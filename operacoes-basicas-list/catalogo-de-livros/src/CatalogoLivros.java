/**
 * Crie uma classe chamada "CatalogoLivros" que possui
 * uma lista de objetos do tipo "Livro" como atributo.
 * Cada livro possui atributos como título, autor e ano de publicação.
 *
 * Implemente os seguintes métodos:
 * adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
 * pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
 * pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
 * pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
 */

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> catalogo;

  public CatalogoLivros() {
    this.catalogo = new ArrayList<Livro>();
  }

  /**
   * @name adicionarLivro
   * @param titulo
   * @param autor
   * @param anoPublicacao
   */
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
  }

  /**
   * pesquisarPorAutor
   * @param autor
   */
  public void pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!catalogo.isEmpty()) {
      for (var livro : this.catalogo) {
          if (livro.getAutor().equalsIgnoreCase(autor)) {
            livrosPorAutor.add(livro);
          }
      }
      System.out.println("-----\nAutor: " + autor);
      for (var livro : livrosPorAutor) {
          System.out.println("\nTitulo: " + livro.getTitulo() + "\tAno de Publicação: " + livro.getAnoPublicacao());
      }
    } else {
      System.out.println("Autor não encontrado no catálogo");
    }
  }

  public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
     List<Livro> livrosPorIntervaloAno = new ArrayList<>();
    if (!catalogo.isEmpty()) {
      for (var livro : this.catalogo) {
          if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
            livrosPorIntervaloAno.add(livro);
          }
      }
      System.out.println("-----\nIntervalo de anos: " + anoInicial + " : " + anoFinal);
      for (var livro : livrosPorIntervaloAno) {
          System.out.println("\nTitulo: " + livro.getTitulo() +
                            "\tAutor: " + livro.getAutor() +
                            "\tAno de Publicação: " + livro.getAnoPublicacao());
      }
    } else {
      System.out.println("O intervalo fornecido não possui livros!");
    }
  }

  public void pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!catalogo.isEmpty()) {
      for (Livro livro : this.catalogo) {
          if (livro.getTitulo().equalsIgnoreCase(titulo)) {
            livroPorTitulo = livro;
            break;
          }
      }
      System.out.println("-----\nTitulo: " + livroPorTitulo.getTitulo() +
                        "\tAno de Publicação: " + livroPorTitulo.getAnoPublicacao() +
                        "\tAutor: " + livroPorTitulo.getAutor());
    } else {
      System.out.println("Título não encontrado no catálogo");
    }
  }
}

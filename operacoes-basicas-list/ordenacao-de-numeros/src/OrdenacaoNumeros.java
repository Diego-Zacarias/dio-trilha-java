import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 2. Ordenação de Números
 * Crie uma classe chamada "OrdenacaoNumeros"
 * que possui uma lista de números inteiros
 * como atributo.
 *
 * Implemente os seguintes métodos:
 * adicionarNumero(int numero): Adiciona um número à lista.
 * ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
 * ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
 */

public class OrdenacaoNumeros {
  List<Integer> numeros;

  public OrdenacaoNumeros() {
    numeros = new ArrayList<Integer>();
  }

  public void adicionarNumero(int numero) {
    numeros.add(numero);
  }

  public void ordenarAscendente() {
    List<Integer> numerosAscendente = numeros;

    Collections.sort(numerosAscendente);
    System.out.println(numerosAscendente);
  }

  public void ordenarDescendente() {
    List<Integer> numerosDescendente = numeros;

    numerosDescendente.sort(Collections.reverseOrder());
    
    System.out.println(numerosDescendente);
  }

  public static void main(String[] args) {
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    for (int i = 0; i < 20; i++) {
      numeros.adicionarNumero((int)(Math.random()*10));
    }

    numeros.ordenarAscendente();

    numeros.ordenarDescendente();
  }
}

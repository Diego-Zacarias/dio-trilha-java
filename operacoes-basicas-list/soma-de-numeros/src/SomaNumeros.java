/**
 * Crie uma classe chamada "SomaNumeros" que
 * possui uma lista de números inteiros como
 *
 * atributo. Implemente os seguintes métodos:
 * adicionarNumero(int numero): Adiciona um número à lista de números.
 * calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
 * encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
 * encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
 * exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Number> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    if (!numeros.isEmpty()) {
      for (Number numero : numeros) {
          soma = soma + numero.intValue();
      }
    }
    return soma;
  }

  public int encontrarMaiorNumero() {
    if (!this.numeros.isEmpty()) {
      int maiorNumero = this.numeros.get(0).intValue();
      for (Number n : this.numeros) {
          if (n.intValue() > maiorNumero) {
            maiorNumero = n.intValue();
          }
      }
      return maiorNumero;
    } else {
      return 0;
    }
  }

  public int encontrarMenorNumero() {
    if (!this.numeros.isEmpty()) {
      int menorNumero = this.numeros.get(0).intValue();
      for (Number n : this.numeros) {
          if (n.intValue() < menorNumero) {
            menorNumero = n.intValue();
          }
      }
      return menorNumero;
    } else {
      return 0;
    }
  }

  public void exibirNumeros() {
    System.out.println(numeros);
  }
}

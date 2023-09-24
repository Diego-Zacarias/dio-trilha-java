import java.util.HashSet;
import java.util.Set;

/**
 * 1. Conjunto de Convidados
 *
 * Crie uma classe chamada "ConjuntoConvidados" que
 * possui um conjunto de objetos do tipo "Convidado"
 * como atributo. Cada convidado possui atributos
 * como nome e código do convite.
 *
 * Implemente os seguintes métodos:
 * adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
 * removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.
 * contarConvidados(): Conta o número total de convidados no Set.
 * exibirConvidados(): Exibe todos os convidados do conjunto.
 */

public class ConjuntoConvidados {
  private Set<Convidado> convidados;

  public ConjuntoConvidados() {
    this.convidados = new HashSet<Convidado>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidados.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado remover = null;

    for (Convidado convidado : this.convidados) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        remover = convidado;
      }
    }

    this.convidados.remove(remover);
  }

  public void contarConvidados() {
    System.out.println("O número de convidados é: " + this.convidados.size());
  }
  
  public void exibirConvidados() {
    this.convidados.forEach(c -> {
      System.out.println("\nnome: " + c.getNome() + "\tcod: " + c.getCodigoConvite());
    });
  }
}

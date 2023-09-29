import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 2. Lista de Alunos
 * 
 * Crie uma classe chamada "GerenciadorAlunos" que irá
 * lidar com uma lista de alunos. Cada aluno terá
 * atributos como nome, matrícula e nota.
 * 
 * Implementaremos os seguintes métodos:
 * 
 * adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
 * removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
 * exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
 * exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
 * exibirAlunos(): Exibe todos os alunos do conjunto.
 */

public class GerenciadorAlunos {
  private Set<Aluno> alunos;

  public GerenciadorAlunos() {
    this.alunos = new HashSet<>();
  }

  /**
   * : Adiciona um aluno ao conjunto.
   * @param nome
   * @param matricula
   * @param media
   */
  public void adicionarAluno(String nome, Long matricula, double media) {
    alunos.add(new Aluno(nome, matricula, media));
  }

  /**
   * : Remove um aluno ao conjunto a partir da matricula, se estiver presente.
   * @param matricula
   */
  public void removerAluno(long matricula) {
    Aluno remover = null;
    for (Aluno aluno : alunos) {
      if (aluno.getMatricula().equals(matricula)) {
        remover = aluno;
        break;
      }
    }
    if (!remover.equals(null)) {
      alunos.remove(remover);
      System.out.println("Aluno com matricula " + matricula + " removido!");
    } else {
      System.out.println("Matricula não localizada na base!");
    }
  }

  /**
   * : Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
   */
  public void exibirAlunosPorNome() {
    Set<Aluno> sortedByNome = new TreeSet<Aluno>(this.alunos);

    for (Aluno aluno : sortedByNome) {
      System.out.println(aluno);
    }
  }

  /**
   * : Exibe todos os alunos do conjunto em ordem crescente de nota.
   */
  public void exibirAlunosPorNota() {
    Set<Aluno> sortedByNota = new TreeSet<Aluno>(new CamparatorByNota());
    sortedByNota.addAll(alunos);
    for (Aluno aluno : sortedByNota) {
      System.out.println(aluno);
    }
  }

  /**
   * : Exibe todos os alunos do conjunto.
   */
  public void exibirAlunos() {
    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
  }
}

/**
 * InnerGerenciadorAlunos
 */
class CamparatorByNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno arg0, Aluno arg1) {
    return Double.compare(arg1.getMedia(), arg0.getMedia());
  }
}
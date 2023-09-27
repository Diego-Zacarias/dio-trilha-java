public class Tarefa {
  private String descricao;
  private boolean concluido;

  public Tarefa(String descricao) {
    this.descricao = descricao;
    this.concluido = false;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean getConcluido() {
    return concluido;
  }

  public void setConcluido(boolean concluido) {
    this.concluido = concluido;
  }

  @Override
  public String toString() {
    return descricao + "\t" + concluido;
  }
}

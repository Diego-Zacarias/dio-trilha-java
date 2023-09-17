
/**
 * Classe que cria uma tarefa ao instanciar
 */
public class Tarefa {
  private String descricao;
  /**
   * Construtor da @classe.
   * @param descricao
   */
  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  /**
   * retorna a descrição da tarefa.
   * @return String descricao
   */
  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return this.descricao;
  }
}

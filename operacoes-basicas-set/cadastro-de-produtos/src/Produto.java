public class Produto implements Comparable<Produto> {
  private long cod;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long cod, String nome, double preco, int quantidade) {
    this.cod = cod;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public long getCod() {
    return cod;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "{ #" + cod + " - " + nome + " R$ " + preco + " qtd " + quantidade + " }";
  }

  @Override
  public int compareTo(Produto p) {
    return this.nome.compareToIgnoreCase(p.nome);
  }
}

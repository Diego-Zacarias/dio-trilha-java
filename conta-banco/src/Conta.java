public class Conta {
  private int numero;
  private String agencia;
  private String nomeCliente;
  private double saldo;
  
  /**
   * Definir o numero da conta bancária
   * @param novoNumero
   */
  public void definirNumero(int novoNumero) {this.numero = novoNumero;}
  
  /**
   * Recuperar o numero da conta bancaria
   * @return tipo int
   */
  public int pegarNumero() {return this.numero;}

  /**
   * Definir a agencia da conta bancaria
   * @param novaAgencia
   */
  public void definirAgencia(String novaAgencia) {this.agencia = novaAgencia;}

  /**
   * Recuperar a agencia da conta bancaria
   * @return tipo String
   */
  public String pegarAgencia() {return this.agencia;}

  /**
   * Definir o nome do cliente da conta bancaria
   * @param novaNomeCliente
   */
  public void definirNomeCliente(String novaNomeCliente) {this.nomeCliente = novaNomeCliente;}
  /**
   * Recuperar o nome do cliente da conta bancaria
   * @return
   */
  public String pegarNomeCliente() {return this.nomeCliente;}

  /**
   * Definir o Saldo da conta bancaria
   * @param novoSaldo
   */
  public void definirSaldo(double novoSaldo) {this.saldo = novoSaldo;}
  /**
   * recuperar o saldo da conta bancaria
   * @return tipo double
   */
  public double pegarSaldo() {return this.saldo;}


}

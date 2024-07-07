
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected int tipo; // 0 - corrente | 1 - poupanca
	protected int clienteId;
	
	
	
	public Conta(int clienteId, int tipo) { 
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
		this.tipo = tipo;
		this.clienteId = clienteId;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosConta() {
		System.out.println(String.format("\t Agencia: %d", this.agencia));
		System.out.println(String.format("\t Conta: %d", this.numero));
		System.out.println(String.format("\t Saldo: R$%.2f", this.saldo));
	}
}

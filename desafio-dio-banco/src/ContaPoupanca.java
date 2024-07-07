
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int clienteId) {
		super(clienteId, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirSaldo() {
		// TODO Auto-generated method stub
		System.out.println("=== Saldo da Conta poupanca ===");
		super.imprimirInfosConta();
	}
}

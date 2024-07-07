
public class ContaCorrente extends Conta{

	public ContaCorrente(int clienteId) {
		super(clienteId, 1);
	}

	@Override
	public void imprimirSaldo() {
		// TODO Auto-generated method stub
		System.out.println("=== Saldo da Conta corrente ===");
		super.imprimirInfosConta();
	}
	
}

public class Main {

	public static void main(String[] args) {
		System.out.println("Benvindo ao sistema bancário Bank sytems");

		Banco banco = new Banco("banco");
		Cliente diego = new Cliente("Diego", banco.getId());
		banco.adicionarCliente(diego);
		Cliente quezia = new Cliente("Quezia", banco.getId());
		banco.adicionarCliente(quezia);

		Conta contaDiegoC = new ContaCorrente(diego.getId());
		diego.adicionarConta(contaDiegoC);
		Conta contaDiegoP = new ContaPoupanca(diego.getId());
		diego.adicionarConta(contaDiegoP);

		Conta contaQueziaC = new ContaCorrente(quezia.getId());
		diego.adicionarConta(contaQueziaC);
		Conta contaQueziaP = new ContaPoupanca(quezia.getId());
		diego.adicionarConta(contaQueziaP);

		contaDiegoC.depositar(1000);
		contaDiegoP.depositar(500);
		contaQueziaC.depositar(3000);
		contaQueziaP.depositar(200);

		contaDiegoC.imprimirSaldo();
		contaQueziaP.imprimirSaldo();

	}
}

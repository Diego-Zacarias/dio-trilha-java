import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private static int SEQUENCIAL = 1;

	private String nome;
	private int id;
	private int bancoId;
	private List<Conta> contas;

	public Cliente(String nome, int bancoId) {
		this.nome = nome;
		this.contas = new ArrayList<>();
		this.id = SEQUENCIAL++;
		this.bancoId = bancoId;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public int getBancoId() {
		return bancoId;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

}

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static int SEQUENCIAL = 1;
	private String nome;
	private int id;
	private List<Cliente> clientes;

	public Banco(String nome) {
		this.nome = nome;
		this.id = SEQUENCIAL++;
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

	public int getId() {
		return id;
	}

}

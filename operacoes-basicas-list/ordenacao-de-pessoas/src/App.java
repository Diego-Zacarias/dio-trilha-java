import java.util.List;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("João", 50, 1.7);
        pessoas.adicionarPessoa("Maria", 40, 1.8);
        pessoas.adicionarPessoa("José", 70, 1.5);
        pessoas.adicionarPessoa("Vera", 20, 1.6);
        pessoas.adicionarPessoa("Fransico", 90, 1.7);
        pessoas.adicionarPessoa("Quitéria", 85, 1.6);

        List<Pessoa> porIdade = pessoas.ordenarPorIdade();
        List<Pessoa> porAltura = pessoas.ordenarPorAltura();

        System.out.println("------\nOrdenação por Idade");
        for (Pessoa pessoa : porIdade) {
            System.out.println("\nNome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade() + "\tAltura: " + pessoa.getAltura());
        }

        System.out.println("\n------\nOrdenação por Altura");
        for (Pessoa pessoa : porAltura) {
            System.out.println("\nNome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade() + "\tAltura: " + pessoa.getAltura());
        }

    }
}

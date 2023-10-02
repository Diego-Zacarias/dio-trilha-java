import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(UUID.randomUUID().toString(), "Areia", 20, 10.5);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Cimento", 10, 11.5);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Brita", 50, 8.3);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Vergalhão", 300, 9.99);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Argamassa", 10, 124.99);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Cascalho", 80, 21.5);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Cal", 44, 43.5);
        produtos.adicionarProduto(UUID.randomUUID().toString(), "Gesso", 33, 98.7);
        System.out.println("------");
        produtos.calcularValorTotalEstoque();
        System.out.println("------");
        produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("------");
        produtos.obterProdutoMaisCaro();
        System.out.println("------");
        produtos.obterProdutoMaisBarato();
        System.out.println("------");
        produtos.exibirProdutos();
    }
}

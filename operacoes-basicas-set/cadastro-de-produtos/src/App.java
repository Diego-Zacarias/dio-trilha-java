public class App {
    public static void main(String[] args) throws Exception {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(0, "macarrão", 10.2, 2);
        produtos.adicionarProduto(1, "feijão", 1.4, 3);
        produtos.adicionarProduto(2, "arroz", 2.45, 6);
        produtos.adicionarProduto(3, "queijo", 3.9, 1);
        produtos.adicionarProduto(4, "manga", 5.2, 2);
        produtos.adicionarProduto(5, "banana", 6.1, 9);
        produtos.adicionarProduto(6, "frango", 7.8, 10);
        produtos.adicionarProduto(7, "peixe", 4.9, 10);

        produtos.exibirProdutosPorNome();

        produtos.exibirProdutosPorPreco();

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        LivrariaOnline catalogo = new LivrariaOnline();

        catalogo.adicionarLivro("link1", "titulo1", "autor1", 29.99);
        catalogo.adicionarLivro("link2", "titulo2", "autor2", 39.99);
        catalogo.adicionarLivro("link3", "titulo3", "autor3", 19.99);
        catalogo.adicionarLivro("link4", "titulo4", "autor4", 59.99);
        catalogo.adicionarLivro("link5", "titulo5", "autor5", 49.99);
        catalogo.adicionarLivro("link6", "titulo6", "autor6", 79.99);
        catalogo.adicionarLivro("link7", "titulo7", "autor7", 69.99);
        catalogo.adicionarLivro("link8", "titulo8", "autor8", 89.99);

        catalogo.exibirLivroMaisBarato();

        catalogo.obterLivroMaisCaro();

        catalogo.exibirLivrosOrdenadosPorPreco();

        System.out.println("\n--------");

        catalogo.pesquisarLivrosPorAutor("autor5");

    }
}

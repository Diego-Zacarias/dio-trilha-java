public class App {
    public static void main(String[] args) throws Exception {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("bpalavra", "definicao da bpalavra");
        dicionario.adicionarPalavra("cpalavra", "definicao da cpalavra");
        dicionario.adicionarPalavra("apalavra", "definicao da apalavra");
        dicionario.adicionarPalavra("dpalavra", "definicao da dpalavra");
        dicionario.adicionarPalavra("zpalavra", "definicao da zpalavra");
        dicionario.adicionarPalavra("xpalavra", "definicao da xpalavra");
        dicionario.adicionarPalavra("ypalavra", "definicao da ypalavra");
        dicionario.adicionarPalavra("hpalavra", "definicao da hpalavra");
        System.out.println("--------");
        dicionario.exibirPalavras();
        System.out.println("--------");
        dicionario.removerPalavra("ypalavra");
        System.out.println("--------");
        dicionario.pesquisarPorPalavra("zpalavra");
        System.out.println("--------");
        dicionario.exibirPalavras();

    }
}

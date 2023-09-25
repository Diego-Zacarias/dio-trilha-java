public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("null");
        palavras.adicionarPalavra("asdf");
        palavras.adicionarPalavra("1rqwer");
        palavras.adicionarPalavra("fnh");
        palavras.adicionarPalavra("uhnt");
        palavras.adicionarPalavra("llun");
        palavras.adicionarPalavra("vedcd");
        palavras.adicionarPalavra("sxsdcrgv");
        palavras.adicionarPalavra("xsd");
        palavras.adicionarPalavra("pknihb");

        palavras.verificarPalavra("null");

        palavras.removerPalavra("null");

        palavras.verificarPalavra("null");

        palavras.exibirPalavrasUnicas();
    }
}

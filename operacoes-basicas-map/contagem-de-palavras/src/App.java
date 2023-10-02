public class App {
    public static void main(String[] args) throws Exception {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("casa", 20);
        palavras.adicionarPalavra("pão", 10);
        palavras.adicionarPalavra("copa", 20);
        palavras.adicionarPalavra("melão", 45);
        palavras.adicionarPalavra("coisa", 11);
        palavras.adicionarPalavra("filme", 56);
        palavras.adicionarPalavra("serie", 90);
        palavras.adicionarPalavra("carro", 65);
        palavras.adicionarPalavra("comida", 24);
        palavras.adicionarPalavra("abacate", 89);

        System.out.println("-------");
        palavras.encontrarPalavraMaisFrequente();
        System.out.println("-------");
        palavras.exibirContagemPalavras();
        System.out.println("-------");
        palavras.removerPalavra("casa");
        System.out.println("-------");
        palavras.exibirContagemPalavras();
    }
}

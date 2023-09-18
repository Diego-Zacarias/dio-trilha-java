public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("A casa", "Manoel", 1991);
        catalogo.adicionarLivro("A lagoa", "Manoel", 1995);
        catalogo.adicionarLivro("O poço", "Pedro", 1999);
        catalogo.adicionarLivro("A campina", "Francisco", 2005);
        catalogo.adicionarLivro("O barco", "Manoel", 2012);

        catalogo.pesquisarPorAutor("Manoel");
        catalogo.pesquisarPorIntervaloAnos(1991, 2000);
        catalogo.pesquisarPorTitulo("O barco");
    }
}

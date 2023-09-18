public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("arroz", 5.5, 2);
        carrinhoDeCompras.adicionarItem("leite", 4.3, 5);
        carrinhoDeCompras.adicionarItem("oleo", 8.1, 3);
        
        carrinhoDeCompras.exibirItens();
        System.out.println("\nTotal" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("leite");

        carrinhoDeCompras.exibirItens();
        System.out.println("\nTotal" + carrinhoDeCompras.calcularValorTotal());
    }
}

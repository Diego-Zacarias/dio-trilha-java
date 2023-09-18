public class App {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        for (int i = 0; i < 20; i++) {
            numeros.adicionarNumero((int)(Math.random() * 10));
        }

        System.out.println( "soma: " + numeros.calcularSoma() +
                            "\nMaior numero: " + numeros.encontrarMaiorNumero() +
                            "\nMenor numero: " + numeros.encontrarMenorNumero());
        numeros.exibirNumeros();
    }
}

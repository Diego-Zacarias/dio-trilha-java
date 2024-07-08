public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical rp = new ReprodutorMusical();
        rp.tocar();
        rp.pausar();
        rp.selecionarMusica("mama áfirca");

        AparelhoTelefonico ap = new AparelhoTelefonico();
        ap.ligar("trabalho");
        ap.atender();
        ap.iniciarCorreioVoz();

        NavegadorInternet ni = new NavegadorInternet();
        ni.exibirPagina("https://google.com");
        ni.adicionarNovaAba();
        ni.atualizarPagina();
    }
}

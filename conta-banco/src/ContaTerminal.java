import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Conta conta = new Conta();
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o número da conta !");
    conta.definirNumero(sc.nextInt());

    System.out.println("Por favor, digite o número da agencia !");
    conta.definirAgencia(sc.next());

    clearBuffer(sc);

    System.out.println("Por favor, digite o nome do cliente !");
    conta.definirNomeCliente(sc.nextLine());

    System.out.println("Por favor, digite o saldo da conta !");
    double saldo = Double.parseDouble(sc.next());
    conta.definirSaldo(saldo);

    sc.close();

    System.out.println(
      "Olá "
      + conta.pegarNomeCliente() +
      ", obrigado por criar uma conta em nosso banco, sua agência é "
      + conta.pegarAgencia() +
      ", conta "
      + conta.pegarNumero() +
      " e seu saldo "
      + conta.pegarSaldo() +
      " já está disponível para saque."
    );
  }
  /**
   * Função adicionada para limpeza do buffer do scanner
   * A função foi obtida em: https://www.clubedohardware.com.br/forums/topic/1417385-limpar-o-buffer-de-teclado-na-ling-java/
   * @param scanner
   */
  private static void clearBuffer(Scanner scanner) {
    if (scanner.hasNextLine()) {
      scanner.nextLine();
    }
  }
}

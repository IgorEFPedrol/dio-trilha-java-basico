import java.util.Locale;
import java.util.Scanner;

/**
*<h1>ContaTerminal</h1>
*A ContaTerminal recebe informações sobre a conta bancária do usuário e as apresenta na tela
*<p>
*<b>Note:</b> Leia atentamente a documentação desta classe
*para desfrutar dos recursos oferecidos pelo autor
*
*@author Igor Pedrol
*@version 1.0
*@since 29/04/2024
*/
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agência: ");
        numero = scanner.nextInt(); 
        System.out.println("Insira o nome da sua Agência: ");
        agencia = scanner.next();
        System.out.println("Qual o seu primeiro nome? ");
        nomeCliente = scanner.next() + " ";
        System.out.println("Qual o seu segundo nome? ");
        nomeCliente = nomeCliente.concat(scanner.next());
        System.out.println("Insira seu saldo atual: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}

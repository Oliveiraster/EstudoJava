import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de Usuario: ");
        cadastro.setNumero( scanner.nextInt());

        System.out.println("Por favor, digite o número da Agência: ");
        cadastro.setAgencia( scanner.next());

        System.out.println("Por favor, digite o Nome do Cliente: ");
        cadastro.setNomeCliente( scanner.next());
        
        System.out.println("Por favor, digite o Saldo: ");
        cadastro.setSaldo( scanner.nextDouble());
        
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                cadastro.NomeCliente, cadastro.Agencia, cadastro.Numero, cadastro.Saldo);

        System.out.println(mensagem);

        scanner.close();

    }
}

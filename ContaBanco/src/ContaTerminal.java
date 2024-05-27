import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o numero da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("");
        sc.nextLine();
        
        System.out.println("Por favor, digite o numero da agência: ");
        String agencia = sc.next();

        System.out.print("");
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        
       System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("");
        

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
        

        sc.close();







    }
}

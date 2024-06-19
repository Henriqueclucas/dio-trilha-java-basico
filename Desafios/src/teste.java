import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digitar o saldo: ");
                    double deposito = sc.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf(String.format("Saldo Atual: " + "%.1f", saldo));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Valor a ser sacado: ");
                    double saque = sc.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Saldo atual: " + (saldo - saque));

                    }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}

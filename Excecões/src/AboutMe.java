import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe{

    public static void main(String[] args) {

        try{
       
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " "
        + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E " + altura + " cm de altura");
        sc.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam numéricos");
        }








    }




}
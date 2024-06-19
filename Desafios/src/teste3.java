import java.util.Scanner;

public class teste3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria");
        }else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria");
        }





    }
}

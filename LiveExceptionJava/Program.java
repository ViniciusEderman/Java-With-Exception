package LiveExceptionJava;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da sua conta: ");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double withDrawLimit = sc.nextDouble();

        ExercicioManeiraOne acc = new ExercicioManeiraOne(number, holder, balance, withDrawLimit);
    }  
}
 
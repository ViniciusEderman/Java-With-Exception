package LiveExceptionJava;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe os dados da sua conta: ");
        System.out.println("");
        System.out.println("Numero: ");
        int number = sc.nextInt();

        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        
        System.out.println("Limite de saque: ");
        double withDrawLimit = sc.nextDouble();

        ContaBancaria acc = new ContaBancaria(number, holder, balance, withDrawLimit);
        
        System.out.println(); // saltando uma linha //
        System.out.println("Informe o valor do saque: ");
        double amount = sc.nextDouble();

        try{
            acc.withDraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } 
        catch(RuntimeException exception) {
            System.out.println(exception);
        }
    sc.close();
    }  
}

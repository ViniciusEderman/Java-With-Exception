/*package javaMonitoria;
import java.util.Scanner;

public class whileExemple {
    public static void main(String [] args) {
        /*Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores "M" e "F".
        Caso digitado qualquer coisa que não seja m/f retormar para que o usuário digite novamente. 

        Scanner keyboard = new Scanner(System.in);
        String sex = "";

         do {
           System.out.println("Digite o seu sexo, apenas M para homem e F para mulher: ");
           sex = keyboard.next();
           System.out.println(sex.equals("F"));
           System.out.println(sex.equals("M"));
         }
         while((sex != "F") && (sex != "M"));
            
        keyboard.close();    
    }
}   */


/* ackage javaMonitoria;
import java.util.Scanner;

public class whileExemple {
    public static void main(String [] args) {
        /*Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores "M" e "F".
        Caso digitado qualquer coisa que não seja m/f retormar para que o usuário digite novamente. 

        Scanner keyboard = new Scanner(System.in);
        String sex = "";
       
            while(sex != "F" && sex != "M") {
                System.out.println("Digite o seu sexo, apenas M para homem e F para mulher: ");
                sex = keyboard.nextLine();
            }
            System.out.println("O seu sexo foi registrado com sucesso");
        keyboard.close();    
    }

} */

package javaMonitoria;
import java.util.Scanner;

public class whileExemple {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String sex = "";
       
            while(true) {
                System.out.println("Digite o seu sexo, apenas M para homem e F para mulher: ");
                sex = keyboard.nextLine().toLowerCase();
                if(sex.equals("m") || sex.equals("f")) {
                	break;
                }else {
                	continue;
                }
            }
            System.out.println("O seu sexo foi registrado com sucesso");
        keyboard.close();
    }
}
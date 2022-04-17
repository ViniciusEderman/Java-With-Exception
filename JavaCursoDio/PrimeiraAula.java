package JavaCursoDio;

import javax.swing.JOptionPane;

public class PrimeiraAula {
  public static void main(String [] args) {
    boolean continueLooping = true;
    do {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        if(a != null && b != null) {
          try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            continueLooping = false;
          }catch(NumberFormatException e) {
              JOptionPane.showMessageDialog(null, "Entrada inválida, utilize apenas números.");
              // e.printStackTrace();
          }catch(ArithmeticException e) {
              JOptionPane.showMessageDialog(null, "Entrada inválida, não possível dividir por 0");
          }finally {
              System.out.println("Sistema finalizado!");
          }
        }else{
          continueLooping = false;
          System.out.println("O valor está vázio, acrescente o numerador e denominador inteiros.");
          System.out.println("Encerrando o programa...");
        }    
    }while(continueLooping);
  }
    public static int dividir(int a, int b) { return a / b; }
}
 
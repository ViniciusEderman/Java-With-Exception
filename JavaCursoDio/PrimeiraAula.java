package JavaCursoDio;

import javax.swing.JOptionPane;

public class PrimeiraAula {
  public static void main(String [] args) {
    boolean continueLooping = true;
    do {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");
        try{
          int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
          System.out.println("Resultado: " + resultado);
          continueLooping = false;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, utilize apenas números.");
            // e.printStackTrace();
        }catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, não possível dividr por 0");
        }finally {
            System.out.println("Sistema finalizado!");
        }
    }while(continueLooping);
  }
    public static int dividir(int a, int b) { return a / b; }
}
 
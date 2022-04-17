package JavaCursoDio;

import javax.swing.JOptionPane;

public class PrimeiraAula {
  public static void main(String [] args) {
    String a = JOptionPane.showInputDialog("Numerador: ");
    String b = JOptionPane.showInputDialog("Denominador: ");
    try{
      int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
      System.out.println("Resultado: " + resultado);
    }catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida, utilize apenas números.");
        // e.printStackTrace();
    }finally{
        System.out.println("Sistema finalizado!");
    }
  }
    public static int dividir(int a, int b) { return a / b; }
}

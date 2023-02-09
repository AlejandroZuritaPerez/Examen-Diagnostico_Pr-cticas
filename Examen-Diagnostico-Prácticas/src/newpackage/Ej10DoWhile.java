package ActVideos;

/**
 *
 * @author alejandro zurita pérez
 */
import java.util.Scanner;

public class Ej10DoWhile {
    
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese un número: ");
    int N = entrada.nextInt();
    
    int i = 1;
    
    do {
      System.out.printf(i + ", ");
      i++;
    } while (i <= N);
 
  }
}

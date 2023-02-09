
package ActVideos;

/**
 *
 * @author alejandro zurita pérez
 */
import java.util.Scanner;

public class Ej9While {
    
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int n = entrada.nextInt();
    int i = 2;
    while (i <= n) {
      System.out.println(i);
      i += 2;
    }
  }
}

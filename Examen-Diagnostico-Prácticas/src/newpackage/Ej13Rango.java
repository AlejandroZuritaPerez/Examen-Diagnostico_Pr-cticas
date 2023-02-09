
package newpackage;

/**
 *
 * @author alejandro zurita pérez
 */
import java.util.Scanner;

public class Ej13Rango {
    
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese el primer número: ");
    int n1 = entrada.nextInt();
   
    System.out.print("Ingrese el segundo número: ");
    int n2 = entrada.nextInt();

    if (n1 < n2) {
      for (int i = n1; i <= n2; i++) {
        System.out.println(i);
      }
    } else {
      for (int i = n2; i <= n1; i++) {
        System.out.println(i);
      }
    }
  }
}

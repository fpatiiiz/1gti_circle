
package circulo_1gti;
import java.util.Scanner;
/**
 *
 * @author patii
 */
public class Circulo_1GTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Escreva o valor do raio: ");
        Scanner scan = new Scanner(System.in);
        
        double raio = scan.nextFloat();
        double area = Math.PI * raio * raio;
        
   
        System.out.println("O valor da area e: " + area);
        
    }
    
}

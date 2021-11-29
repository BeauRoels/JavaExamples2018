
package machtig;
import java.util.Scanner;
public class Machtig {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int $cijfer;
        int $tweede;
        int $derde;
        
        System.out.println("Geef geheel getal in: ");
        $cijfer = scanner.nextInt();
        
        $tweede = $cijfer * $cijfer;
        $derde = $cijfer * $cijfer * $cijfer;        
        
        System.out.println("De tweedemacht van " + $cijfer +" is " + $tweede );
        System.out.println("De derdemacht van " + $cijfer +" is " + $derde );
    }
    
}

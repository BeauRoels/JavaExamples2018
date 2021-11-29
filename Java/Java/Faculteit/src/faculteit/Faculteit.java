package faculteit;
import java.util.Scanner;
public class Faculteit {
    public static void main(String[] args) 
    {
     int invoer;
     int resulaat;
     
 
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Geef geheel getal in: ");
        invoer = scanner.nextInt();
        
        int [] getallen = new int [invoer];
        int newInvoer = invoer;
     
     do
     {
        
        newInvoer--;
     }
     while (invoer == 0);
    }
    
}

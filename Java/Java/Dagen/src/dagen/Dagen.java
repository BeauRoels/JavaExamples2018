package dagen;
import java.util.Scanner;
public class Dagen {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String maand;

        System.out.print("Geef het maand in: ");
        maand = scanner.next();
        
        if (maand.toUpperCase().equals("JANUARI")||maand.toUpperCase().equals("MAART")||maand.toUpperCase().equals("MEI")||maand.toUpperCase().equals("JULI")||maand.toUpperCase().equals("AUGUSTUS")||maand.toUpperCase().equals("OKTOBER")||maand.toUpperCase().equals("DECEMBER"))
        {
            System.out.println("Het telt: 31");
        }
        else if (maand.toUpperCase().equals("APRIL")||maand.toUpperCase().equals("JUNI")||maand.toUpperCase().equals("SEPTEMBER")||maand.toUpperCase().equals("NOVEMBER"))
        {
            System.out.println("Het telt: 30");
        }
        else if (maand.toUpperCase().equals("FEBRUARI"))
        {
            System.out.println("Het telt: 28");
        }
        else
        {
             System.out.println("Leer u maanden.");
        }
    }
    
}

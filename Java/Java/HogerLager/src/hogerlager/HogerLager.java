package hogerlager;
import java.util.Scanner;
import java.util.Random;
public class HogerLager {
    public static void main(String[] args) 
    {   
        int Getal;
        int gok;
        int pogingen = 0;
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        Getal = random.nextInt(20);
        
            do
            {
            System.out.println("Raad wat het getal is");
            gok = scanner.nextInt();
            
            if (gok > Getal)
            {
                 System.out.println("Raad lager");
            }
            else if (gok < Getal)
            {
                 System.out.println("Raad hoger");
            }
            
            pogingen++;
            }
            while (Getal != gok);
        
        System.out.println("Correct, het getal was " + Getal + ", je hebt " + pogingen + " pogingen gedaan");
    }
    
}

package rapportbeoordeling;
import java.util.Scanner;
public class Rapportbeoordeling {
    public static void main(String[] args) 
    {
        int punten;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geef je score in van de toets (op 10) ");
        punten = scanner.nextInt();
        
        if (punten < 5)
            System.out.println("Beter studeren");
        else if (punten == 6)
            System.out.println("Net erdoor, still terrible");
        else if (punten == 7)
            System.out.println("Wow een 7, super mediocre!");
        else if (punten == 8)
            System.out.println("Een 8, net niet mediocre!");
        else if (punten == 9)
            System.out.println("Synoniem voor fuck you niet perfect genoeg");
        else if (punten == 10)
            System.out.println("GG WP you deserve a golden star");
        else
            System.out.println("Geef correcte input monk");
    }
    
}

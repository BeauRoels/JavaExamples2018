package seconden.naar.uren;

import java.util.Scanner;

public class SecondenNaarUren {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int seconden;
        int minuten;
        int uren;
                 
        System.out.print("Geef het aantal seconden in: ");
        seconden= scanner.nextInt();
        
        minuten = seconden /60;
        seconden = seconden % 60;
        uren = minuten /60;
        minuten = minuten %60;
        
        System.out.print(uren + " uur, " + minuten + " minuten, " + seconden + " seconden ");
        
    }
    
}

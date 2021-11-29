package tafels;
import java.util.Scanner;
public class Tafels {
    public static void main(String[] args) {
        
        double getal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien getal in waarvan tafels berekent moeten worden: ");
        getal = scanner.nextDouble();
        
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i + " x " + getal + " = " + getal*i);
        }
    }
    
}

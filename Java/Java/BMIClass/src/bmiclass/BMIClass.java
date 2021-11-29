package bmiclass;

import java.util.Scanner;

public class BMIClass {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String naam;
        double massa,lengte;
        
        System.out.println("Geef naam in: ");
        naam = scanner.next();
        
        System.out.println("Geef kg in: ");
        massa = scanner.nextDouble();
        
        System.out.println("Geef lengte in: ");
        lengte = scanner.nextDouble();
    }
    
}

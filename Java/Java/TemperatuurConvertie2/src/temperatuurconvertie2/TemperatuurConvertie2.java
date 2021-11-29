
package temperatuurconvertie2;

import java.util.Scanner;

public class TemperatuurConvertie2 {

    public static void main(String[] args) 
    {
        double celsuis;
        double fahrenheit;
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Geef graden Celsuis in: ");
        fahrenheit = scanner.nextInt();
        
        celsuis = (fahrenheit - 32) * 5 /9;
        
        System.out.println("Temperatuur in Celsuis: " + celsuis);
        System.out.println("Temperatuur in Fahrenheit: " + fahrenheit);
        
    }
    
}

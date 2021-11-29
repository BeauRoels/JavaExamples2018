/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatuurconvertie;
import java.util.Scanner;
public class TemperatuurConvertie {

   
    public static void main(String[] args) 
    {
        double celsuis;
        double fahrenheit;
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Geef graden Celsuis in: ");
        celsuis = scanner.nextInt();
        
        fahrenheit = celsuis * 9 / 5 + 32;
        
        System.out.println("Temperatuur in Celsuis: " + celsuis);
        System.out.println("Temperatuur in Fahrenheit: " + fahrenheit);
        
    }
    
}
;

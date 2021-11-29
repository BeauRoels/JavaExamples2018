/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaleanalyse;
import java.util.Scanner;

public class DecimaleAnalyse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double $cijfer;
        int $eenheden;
        int $tienden;
        int $honderdsten;
                 
        System.out.println("Geef het getal in: ");
        $cijfer = scanner.nextDouble();
        
        $eenheden = (int) $cijfer;
        $tienden = (int)($cijfer * 10) - ($eenheden * 10);
        $honderdsten = (int)($cijfer * 100) - ($eenheden * 100) - ($tienden * 10) ;
        
        System.out.println($eenheden + " eenheden");
        System.out.println($tienden + " tienden");
        System.out.println($honderdsten + " honderstend");
    }
    
}

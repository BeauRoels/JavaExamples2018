package colaautomaat;
import java.util.Scanner;
public class ColaAutomaat {
    public static void main(String[] args) {
        
        double cola  = 1.20;
        double change;
        double ontvangen;
        
        int euro = 0;
        int halve = 0;
        int twintig = 0;
        int tien = 0;
        int vijf = 0;
        int twee = 0;
        int een = 0;
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Cola kost " + cola +", dien geld in automaat: ");
        ontvangen = scanner.nextDouble();
        
        change = ontvangen - cola;
        
        if(change > 0 ){
        while (change > 1)
        {
             change -= 1;
             euro++;
        }
        while (change > 0.50)
        {
             change -= 0.50;
             halve++;
        }
        while (change > 0.20)
        {
             change -= 0.20;
             twintig++;
        }
        while (change > 0.10)
        {
             change -= 0.10;
             tien++;
        }
        while (change > 0.05)
        {
             change -= 0.05;
             vijf++;
        }
        while (change > 0.02)
        {
             change -= 0.02;
             twee++;
        }
        while (change > 0.01)
        {
             change -= 0.01;
             een++;
        }
        
        System.out.println("Uw wisselgeld is " + euro +" euro, " + halve +" vijftig cent, " + twintig + " twintig cent, " +  tien + " tien centjes, " + vijf + " vijf centjes, " + twee +  " twee centjes, " + een + " een centjes" );
        }
        if(change == 0 )
        {
            System.out.println("u heeft gepast betaald");
        }        
        if(change < 0)
        {
            System.out.println("Te weinig betaald");
        }
        }
}
     
    


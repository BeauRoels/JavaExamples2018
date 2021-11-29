package tweedemach;
import java.util.Scanner;

public class Tweedemach {
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);

       int macht= 0;
       int getal;
       int teller=1;
       
       System.out.print("Geef het getal in: ");
       getal= scanner.nextInt();
       
       do
       {
           if (getal < 10000)
           {
               macht = getal *= teller;
               System.out.println("het getal tot de macht "+teller+" = "+macht);
               teller++;

           }
       }
       while (macht < 10000);
    }
    
}

package reisbureau;
public class Reisbureau {
    public static void main(String[] args) 
    {
        Reis reis = new Reis("Syrie", 10, 50, 2, 1);
        
        System.out.println(reis.berekenAantalDeelnemers()+" aantal deelnemers");
        System.out.println(reis.berekenTotalePrijs()+" totale prijs");
        System.out.println(reis.toonGegevens());
        reis.verhoogMet(2); System.out.println("verhoogd met 2");
        
    }
    
}

package meetkunde;
public class Meetkunde {
    public static void main(String[] args) 
    {
        
        System.out.println("~~Rechthoek~~");
        Rechthoek test = new Rechthoek(420,69);
        System.out.println(test.getBreedte());
        System.out.println(test.getLengte());
        System.out.println();
        System.out.println("De omtrek is "+test.berekenOmtrek());
        System.out.println("De oppervlakte is "+test.berekenOppervlakte());
        test.setBreedte(145);
        System.out.println();
        System.out.println("De omtrek is "+test.berekenOmtrek());
        System.out.println("De oppervlakte is "+test.berekenOppervlakte());
        System.out.println(test.hashCode());
        System.out.println(test.toString());
        
        System.out.println();
        System.out.println();
        
        double straal = 15;
        System.out.println("~~Cirkel~~");
        Cirkel cirk  = new Cirkel(15);
        System.out.println(cirk.getStraal());
        System.out.println();
        System.out.println("De omtrek is "+cirk.berekenOmtrek());
        System.out.println("De oppervlakte is "+cirk.berekenOppervlakte());
        cirk.setStraal(145);
        System.out.println();
        System.out.println("De omtrek is "+cirk.berekenOmtrek());
        System.out.println("De oppervlakte is "+cirk.berekenOppervlakte());
        System.out.println(cirk.hashCode());
        System.out.println(cirk.toString());
        
    }
    
}

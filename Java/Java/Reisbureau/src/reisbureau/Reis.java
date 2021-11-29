
package reisbureau;


public class Reis 
{

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        this.bestemming = bestemming;
    }

    public int getDagen() {
        return dagen;
    }

    public void setDagen(int dagen) {
        this.dagen = dagen;
    }

    
    public double getPrijs() {
        return prijs;
    }

  
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

   
    public int getOuders() {
        return ouders;
    }

    
    public void setOuders(int ouders) {
        this.ouders = ouders;
    }

    
    public int getKinderen() {
        return kinderen;
    }

    
    public void setKinderen(int kinderen) {
        this.kinderen = kinderen;
    }
    
    private String bestemming;
    private int dagen;
    private double prijs;
    private int ouders;
    private int kinderen;
    
    public Reis()
    {
        bestemming ="";
        dagen = 0;
        ouders = 0;
        kinderen = 0;
        prijs = 0;
    }
     public Reis(String bestemming, int dagen, int ouders, double prijs)
    {
        this.bestemming =bestemming;
        this.dagen = dagen;
        this.ouders = ouders;
        this.kinderen = 0;
        this.prijs = prijs;
    }
     public Reis(String bestemming, int dagen, int ouders,int kinderen, double prijs)
    {
        this.bestemming =bestemming;
        this.dagen = dagen;
        this.ouders = ouders;
        this.kinderen = kinderen;
        this.prijs = prijs;
    }
    public int berekenAantalDeelnemers()
    {
        return getOuders() + getKinderen(); 
    }
    public double berekenTotalePrijs()
    {
        return (getOuders() + getPrijs() * getDagen() +(getKinderen() * getDagen())/2);
    }
    public void verhoogMet (int waarde)
    {
        setPrijs(getPrijs() + waarde);
    }
    public void verhoogMet(double waarde)
    {
        setPrijs (getPrijs() + waarde);
    }
    public String toonGegevens()
    {
        String tekst = "Deze reis gaat naar " + bestemming + ". " + dagen + " aantal dagen." + ouders +" aantal ouders. " +kinderen + " aantal kinderen. Voor de prijs van: "+ prijs;
        return tekst;
    }
     
           
}

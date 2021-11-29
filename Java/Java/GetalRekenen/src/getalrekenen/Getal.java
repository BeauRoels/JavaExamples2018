package getalrekenen;
public class Getal 
{
    private int waarde;
    
   public Getal(int waarde)
   {
   this.waarde = waarde;
   }
   public Getal(){
       waarde = 0;
   }
    public int getWaarde() {
        return waarde;
    }
    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }
    
        public void printGetal()
    {
        System.out.println("De waarde van het getal is " + this.getWaarde());
               
    }
    public int absoluut()
    {
        
        return Math.abs(getWaarde());
    }
    public int som(int getal)
    {
        return waarde + getal;
    }
    public double som(double getal)
    {
        return waarde + getal;
    }
    public int toDouble()
    {
        return 2*waarde;
    }
}

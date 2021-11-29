package meetkunde;
public class Cirkel
{
     private double straal;
    //consturctor
    public Cirkel(double straal)
    {
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }
    public double berekenOmtrek()
    {
        double cirkelomtrek = 2 * straal * Math.PI;
        return cirkelomtrek;
    }
    public double berekenOppervlakte()
    {
        double oppervlakte = (straal * straal) * Math.PI ;
        return oppervlakte; 
    }
}

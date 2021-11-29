package meetkunde;

public class Rechthoek 
{
    private int breedte, lengte;
    //consturctor
    public Rechthoek(int ingevoerdeLengte, int ingevoerdeBreedte)
    {
        lengte = ingevoerdeLengte;
        breedte = ingevoerdeBreedte;
        
    }
    
    public Rechthoek()
    {
    
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }
    
    
    public int berekenOmtrek()
    {
        int omtrek = (lengte * breedte) *2;
        return omtrek;
    }
    public int berekenOppervlakte()
    {
        int oppervlakte = lengte * breedte;
        return oppervlakte;
    }
}

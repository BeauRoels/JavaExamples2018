package getalrekenen;
public class GetalRekenen {

    public static void main(String[] args) 
    {
        Getal test = new Getal(2);
        System.out.println(test.absoluut());
        System.out.println(test.toDouble());
        System.out.println(test.som(1));
        System.out.println(test.som(2.6));
        
        test.printGetal();
    }
    
}

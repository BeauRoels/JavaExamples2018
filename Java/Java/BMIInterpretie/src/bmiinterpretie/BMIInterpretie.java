package bmiinterpretie;
public class BMIInterpretie {

    public static void main(String[] args) 
    {
        int massa = 70;
        double bmi;
        int lengte= 175;  
        
        bmi = massa / (lengte*lengte);
        
        if (bmi < 18.5)
        {
            System.out.println("ondergewicht");
        }
        else if (25 > bmi && bmi > 18.5)
        {
            System.out.println("normaal");
        }
        else if (27 > bmi && bmi > 25)
        {
            System.out.println("licht overgewicht");
        }
        else if (30 > bmi && bmi > 27)
        {
            System.out.println("matig overgewicht");
        }
        else if (40 > bmi && bmi > 30)
        {
            System.out.println("ernstig overgewicht");
        }
        else  {
        System.out.println("dodelijk overgewicht");
        }
    }
    
}

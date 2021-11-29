
package loto;


public class Loto {


    public static void main(String[] args)
    {
        int[] lotto = new int[7];
        lotto[0] =(int) (Math.random() * 42 + 1);
        for(int i = 1; i < lotto.length; i++)
        {
            lotto[i] = (int) (Math.random() * 42 + 1);
        }
        for(int i = 0; i < lotto.length; i++)
        {
             for(int j = 0; j < lotto.length; j++)
             {
                  while (lotto[i] == lotto[j] && i != j){
                      lotto[j] = (int) (Math.random() * 42 + 1);
                  }
             }
        }
        for(int j = 0; j < lotto.length; j++)
        {
            for(int i = 0; i < lotto.length; i++)
            {
                if (lotto[i] < lotto[i -1])
                {
                    int test;
                    test = lotto[i];
                    lotto[i] = lotto[i -1];
                    lotto[i -1] = test;
                    
                }
            }
        }
        
    }

    
}

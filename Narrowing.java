//Output
Double Data type value 200.06
Long Data type value 200
Int Data type value 200
//

public class Task {
    public static void main(String[] args) 
    {
        double d = 200.06;
          
        //explicit type casting
        long l = (long)d;
          
        //explicit type casting
        int i = (int)l;
         
        System.out.println("Double Data type value "+d);         
        System.out.println("Long Data type value "+l);       
        System.out.println("Int Data type value "+i);
    }
}
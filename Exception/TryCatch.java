package Exception;

public class TryCatch {

    public  static void main(String args[] )
    {
        try {
            
            int a = 10;;
            int result = a / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception  "  +  e);
        }
    }
    
}

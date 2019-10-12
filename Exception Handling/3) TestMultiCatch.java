
import java.io.* ;

public class TestMultiCatch
{
   public static void myMethod1()
   {
      try {
         throw new ArithmeticException( "Pay attention class!" );
      }
      catch ( ArithmeticException e ) {     // try to change the ordering of these three 
                                            // exceptions!!! and you will see... what?
         System.out.println(">> -----");
         System.out.println( e.getMessage() );
         System.out.println(">> -----");
         System.out.println( e.toString() );
         System.out.println(">> -----");
         e.printStackTrace() ;
         System.out.println(">> -----");
      }
   }

   public static void myMethod2()
   {
      try {
         // ...
      }
      catch ( Exception e ) {
         ;
      }
      catch ( IndexOutOfBoundsException e ) {
         ;
      }
      catch ( ArithmeticException e ) {     // try to change the ordering of these three 
                                            // exceptions!!! and you will see... what?
         ;
      }
   }

   public static void main( String[] args )
   {
      myMethod1();
      myMethod2();
   }
}


import java.io.* ;

public class TestUncheckedException
{
   public static void main( String[] args )
   {
      // Note: not analyzed by compiler
      //   - so, compilable!!! but...

      int a , b ;
      a = 0 ;
      b = 102 / a ;

      int [] c = { 0 , 1 , 2 };
      int d = c[3] ;

      throw new ArithmeticException();

      //throw new IOException();
   }
}

import java.util.Scanner ; 
public class TestException
{
   public static void main( String[] args )
   {
      int     i, numOfStudents;
      double  totalMarks = 0, avgMarks = 0 ;
      Scanner sc         = new Scanner( System.in ); 

      try
      {
		   // ask for user input
         System.out.print( "Enter number of students: " );
         numOfStudents = sc.nextInt();

         // After you tried both with/without exception cases when running this example program
         // with different user input, we can try steps 1 and 2:
         // Step 1: You may uncomment the following code -> this generates also an ArithmeticException
         //int a = 100 / 0 ;

         // Step 2: Then, comment the above and uncomment the following -> this generates what?
         //int [] ar = { 1 , 2 };
         //ar[2] = 1 ;

		   // exception?
         if ( numOfStudents <= 0 )
            throw new ArithmeticException( "Error: no of students must not be zero!" );

		   // ask score of each student and
         System.out.print( "Enter student marks: " );
         for ( i = 0 ;  i < numOfStudents ; i++ )
            totalMarks += sc.nextDouble() ;

         // compute the average
         System.out.print( "Compute the average ... " );
         avgMarks = totalMarks / (double) numOfStudents ;

		   // report the average
         System.out.println( "Average marks = " + avgMarks );
      }
      catch ( ArithmeticException e ) {
         System.out.println("inside catch:");
         System.out.println( e.getMessage() );
      }
		finally {
         System.out.println( "this is finally" );
		}
      System.out.println( "End of program execution!" );
   }
}

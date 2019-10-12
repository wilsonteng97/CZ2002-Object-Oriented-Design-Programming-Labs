public class ExceptionExamples
{
    public static void main(String[] args)
    {
        /////////////////////////////////////////////
        // Example 1:

        int a , b ;
        a = 0 ;

        System.out.println("Hello 1");

        //step 1: uncomment and observer this exception
        //b = 102 / a ;

        System.out.println("Hello 2");


        /////////////////////////////////////////////
        // Example 2:

        int [] c = { 0 , 1 , 2 };

        System.out.println("Hello 3");

        //step 2: uncomment and observer this exception
        //int d = c[3] ;

        System.out.println("Hello 4");


        /////////////////////////////////////////////
        // Example 3:

        System.out.println("Hello 5");

        //step 3: uncomment and observer this exception
        //        user can somehow intentionally throw an exception
        //        but these kinds of exception can be analyzed by 
        //        compiler and must be included inside try block
        //        with proper catch
        //throw new Exception();

        //step 4:
        //try {
        //   throw new Exception();
        //}
        //catch ( Exception e ) { }

        System.out.println("Hello 6");
	 }
}

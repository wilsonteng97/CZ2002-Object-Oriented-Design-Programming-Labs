import java.io.*;
public class WritingTest
{
	public static void main(String[] args) 
	{
	    int data = 1  ;
	    //int data = 3  ;
	    //int data = 15 ;

		// write data to a text file
		try 	
		{
			PrintWriter pwStream
			    = new PrintWriter( new BufferedWriter( new FileWriter("out.txt") ));

			pwStream.print( data );
			pwStream.print( data );
			pwStream.print( data );
			pwStream.print( data );
			pwStream.print( data );
			pwStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}

		// write data to a binary file
		try 
		{
			FileOutputStream     foStream = new FileOutputStream( "out.bin" );
			BufferedOutputStream boStream = new BufferedOutputStream(foStream);
			ObjectOutputStream   doStream = new ObjectOutputStream(boStream);

			doStream.writeInt( data );
			doStream.writeInt( data );
			doStream.writeInt( data );
			doStream.writeInt( data );
			doStream.writeInt( data );
			doStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
}


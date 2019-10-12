import java.io.*;
import java.util.Scanner;
public class ScannerReadingTextFiles 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner scStream = new Scanner(new File("data.txt"));
			
			String inputLine;
			System.out.println("The file contains:");
			while (scStream.hasNext()) 
			{
				inputLine = scStream.nextLine();
				System.out.println(inputLine);
			}
			scStream.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Error opening the input file!" + e.getMessage());
			System.exit(0);
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		
		
	}
}



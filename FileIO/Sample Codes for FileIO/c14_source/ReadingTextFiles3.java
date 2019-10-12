import java.util.Scanner;
import java.io.*;
public class ReadingTextFiles3 
{
	public static void main(String[] args) 
	{
		String fileName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		fileName = sc.nextLine();
		try 
		{
			BufferedReader brStream = new BufferedReader (new FileReader(fileName));
			String inputLine;
			int i;
			System.out.println("The file contains:");
			for (i=0; i<5; i++) 
			{
				inputLine = brStream.readLine();
				System.out.println(inputLine);
			}
			brStream.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Error opening the input file!" + fileName);
			System.exit(0);
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + fileName);
			e.printStackTrace();
			System.exit(0);
		}
	}
}



import java.util.Scanner;
import java.io.*;
public class CheckFileReading
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		String fileName = sc.nextLine();
		File inFile = new File(fileName);
		while ((!inFile.exists()) || (!inFile.canRead())) 
		{
			if (!inFile.exists()) 
				System.out.println("File not exist!");
			else if (!inFile.canRead())
				System.out.println("File can't be read!");
			System.out.println("Enter the file name again: ");
			fileName = sc.nextLine();
			inFile = new File(fileName);
		}
		try 
		{
			BufferedReader brStream = new BufferedReader(
			new FileReader(fileName));
			String inputLine;
			int i;
			System.out.println("The file contains: ");
			for (i=0; i<5; i++) 
			{
				inputLine = brStream.readLine();
				System.out.println(inputLine);
			}
			brStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
}



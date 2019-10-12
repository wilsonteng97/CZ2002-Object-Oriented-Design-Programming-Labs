import java.io.*;
import java.util.*;	// needed for StringTokenizer
public class ReadingTextFiles2 
{
	public static void main(String[] args) 
	{
		try 
		{
			BufferedReader brStream = new BufferedReader(new FileReader("data.txt"));
			String inputLine, str1, str2;
			int i, value;
			System.out.println("The file contains:");
			for (i=0; i<5; i++) 
			{
				inputLine = brStream.readLine();
				StringTokenizer aString = new StringTokenizer(inputLine);
				str1 = aString.nextToken();
				str2 = aString.nextToken();
				value = Integer.parseInt(aString.nextToken());
				System.out.println("str1: " + str1 + " str2: " + str2 + " value: " + value);
			}
			brStream.close();
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


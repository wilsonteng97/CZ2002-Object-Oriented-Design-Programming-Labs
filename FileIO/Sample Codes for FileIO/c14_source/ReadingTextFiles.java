import java.io.*;
public class ReadingTextFiles 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader frStream = new FileReader("data.txt");
			BufferedReader brStream = new BufferedReader (frStream);
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



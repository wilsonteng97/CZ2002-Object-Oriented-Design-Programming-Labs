import java.io.*;
public class WritingTextFiles 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fwStream = new FileWriter("data.txt");
			BufferedWriter bwStream = new BufferedWriter(fwStream);
			PrintWriter pwStream = new PrintWriter(bwStream);
			int num;
			for (num=0; num<5; num++) 
			{
				pwStream.println("Number = " + num*5);
			}
			pwStream.close();
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


import java.io.*;
public class ProcessingFileStreams
{
	public static void main(String[] args)
	{
		try 
		{
			// Step 1: Create and open file streams 
			FileReader iStream = new FileReader("input.txt");
			FileWriter oStream = new FileWriter("output.txt");

			// Step 2: Perform Read/Write Operation 
			int data;
			data = iStream.read();
			oStream.write(data);

			// Step 3: Close file streams 
			iStream.close();
			oStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
}


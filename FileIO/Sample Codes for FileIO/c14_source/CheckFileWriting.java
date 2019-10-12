import java.util.Scanner;
import java.io.*;
public class CheckFileWriting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the file name: ");
		String fileName = sc.nextLine();
		File outFile = new File(fileName);
		while ((!outFile.exists()) || (!outFile.canWrite())) 
		{
			if (!outFile.exists())
				System.out.println("File not exist!");
			else if (!outFile.canWrite())
				System.out.println("File can't be written to! ");
			System.out.println("Enter the file name again: ");
			fileName = sc.nextLine();
			outFile = new File(fileName);
		}
		if (outFile.exists()) 
		{
			System.out.println("File " + fileName + " currently exists.");
			System.out.print("Overwrite the file? (y/n): ");
			String inputAns = sc.next();
			char ans = inputAns.charAt(0);
			if (ans == 'n')
			System.exit(1);
		}
		try 
		{
			PrintWriter pwStream = new PrintWriter(
			new BufferedWriter(new FileWriter(fileName)));
			int num;
			for (num=0; num<5; num++) 
				pwStream.println("Number = " + num*5);
			pwStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("IO Error!" + e.getMessage());
			System.exit(0);
		}
	}

}



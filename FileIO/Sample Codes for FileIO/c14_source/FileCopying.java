import java.util.Scanner;
import java.io.*;
public class FileCopying 
{
	public static void main(String[] args) throws IOException 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input file name: ");
		String fileName1 = sc.nextLine();
		System.out.println("Enter the output file name: ");
		String fileName2 = sc.nextLine();
		FileReader frStream = new FileReader(fileName1);
		FileWriter fwStream = new FileWriter(fileName2);

		System.out.println("The file contains:");
		while ((ch=frStream.read()) != -1) 
		{
			System.out.print((char)ch);
			fwStream.write((char)ch);
		}
		frStream.close();
		fwStream.close();
	}
}


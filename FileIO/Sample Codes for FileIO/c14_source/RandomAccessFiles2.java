import java.util.Scanner;
import java.io.*;
public class RandomAccessFiles2
{
	public static void main(String[] args)
	{
		String fileName = " ";
		Scanner sc = new Scanner(System.in);
		try {
			int id, age, noOfRecords;
			double height;
			System.out.println("Enter the file name: ");
			fileName = sc.nextLine();
			RandomAccessFile rafStream = new RandomAccessFile (fileName,"rw");
			System.out.print("Enter the number of records: ");
			noOfRecords = sc.nextInt();
			for (int i=0; i< noOfRecords; i++) 
			{
				id = rafStream.readInt();
				age = rafStream.readInt();
				height = rafStream.readDouble();
				System.out.println("Id number: " + id + "; age: " + age + "; height: " + height);
			}
			rafStream.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("IOError: File not found!" + fileName);
			System.exit(0);
		}
		catch (IOException e) 
		{
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}
	}
}



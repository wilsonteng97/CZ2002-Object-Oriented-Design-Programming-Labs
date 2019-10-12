import java.util.Scanner;
import java.io.*;
public class RandomAccessFiles 
{
	public static void main(String[] args) 
	{
		String fileName = " ";
		Scanner sc = new Scanner(System.in);
		try 
		{
			int id, age, noOfRecords;
			double height;
			System.out.println("Enter the file name: ");
			fileName = sc.nextLine();
			RandomAccessFile rafStream = 
				new RandomAccessFile (fileName,"rw");
			System.out.print("Enter the number of records: ");
			noOfRecords = sc.nextInt();
			for (int i=0; i < noOfRecords; i++) 
			{
				System.out.print("Enter id number: ");
				id = sc.nextInt();
				rafStream.writeInt(id);
				System.out.print("Enter age: ");
				age = sc.nextInt();
				rafStream.writeInt(age);
				System.out.print("Enter height: ");
				height = sc.nextDouble();
				rafStream.writeDouble(height);
			}
			System.out.println("Writing completed! ");
			System.out.println("The size of the file is " + rafStream.length() + " bytes");
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



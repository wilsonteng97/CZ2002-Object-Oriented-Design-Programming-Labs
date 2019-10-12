import java.util.Scanner;
import java.io.*;
public class WritingBinaryData 
{
	public static void main(String[] args) 
	{
		String fileName = " ";
		try 
		{
			String name;
			int age;
			double height;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name: ");
			fileName = sc.nextLine();
			FileOutputStream foStream = new FileOutputStream(fileName);
			BufferedOutputStream boStream = new BufferedOutputStream(foStream);
			ObjectOutputStream doStream = new ObjectOutputStream(boStream);
			int i;
			for (i=0; i<3; i++) 
			{
				System.out.print("Enter name: ");
				name = sc.next();
				System.out.print("Enter age: ");
				age = sc.nextInt();
				System.out.print("Enter height: ");
				height = sc.nextDouble();
				doStream.writeUTF(name);		// name
				doStream.writeInt(age);			// age
				doStream.writeDouble(height);	// height
			}
			System.out.println("Writing completed!");
			doStream.close();
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



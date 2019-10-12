import java.util.Scanner;
import java.io.*;
public class ReadingBinaryData1
{
	public static void main(String[] args)
	{
		String fileName="";
		try {
			String name;
			int age;
			double height;
			Scanner sc = new Scanner(System.in);
					
			System.out.println("Enter the file name: ");
			fileName = sc.nextLine();
			FileInputStream fiStream = new FileInputStream(fileName);
			BufferedInputStream biStream = new BufferedInputStream(fiStream);
			ObjectInputStream diStream = new ObjectInputStream(biStream);
			int i;
			for (i=0; i < 3; i++) 
			{
				System.out.print("Name: ");
				System.out.println(name = diStream.readUTF());	
				System.out.print("Age: ");
				System.out.println(age = diStream.readInt());	
				System.out.print("Height: ");
				System.out.println(height = diStream.readDouble());
			}
			diStream.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("IOError: File not found!" + fileName);
			System.exit(0);
		}
		catch (IOException e) {
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}
	}
}


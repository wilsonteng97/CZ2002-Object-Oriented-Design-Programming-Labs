import java.util.Scanner;
import java.io.*;
public class UsingFileClass
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fileName = sc.nextLine();
		File aFile = new File(fileName);

		System.out.println("Test exists = " + aFile.exists());
		System.out.println("Test isDirectory = " + aFile.isDirectory());
		System.out.println("Test isFile = " + aFile.isFile());
		System.out.println("Test canRead = " + aFile.canRead());
		System.out.println("Test canWrite = " + aFile.canWrite());

		System.out.println("Test getName = " + aFile.getName());
		System.out.println("Test getAbsolutePath = " + aFile.getAbsolutePath());
		System.out.println("Test getParent = " + aFile.getParent());
		System.out.println("Test length = " + aFile.length() + " bytes");
	}
}



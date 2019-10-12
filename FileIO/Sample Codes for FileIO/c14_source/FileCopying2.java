import java.util.Scanner;
import java.io.*;
public class FileCopying2 
{
	public static void main(String[] args) throws IOException 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input file name: ");
		String fileName1 = sc.nextLine();
		System.out.println("Enter the output file name: ");
		String fileName2 = sc.nextLine();
		BufferedReader brStream = new BufferedReader 
				(new FileReader(fileName1));
		PrintWriter pwStream = new PrintWriter(new 		
				BufferedWriter(new FileWriter(fileName2)));
		System.out.println("The file contains:");
		String aString = brStream.readLine(); 
		while (aString != null) {
	  	 	System.out.println(aString);
	   		pwStream.println(aString);
		  	aString = brStream.readLine(); 
		}
		brStream.close();
		pwStream.close();
   }


}


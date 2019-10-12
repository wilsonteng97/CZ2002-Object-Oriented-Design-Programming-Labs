import java.util.Scanner;
public class AverageMarksV2 
{
	public static void main(String[] args) 
	{
		int i, numOfStudents;
		double totalMarks=0, avgMarks=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		numOfStudents = sc.nextInt();
		if (numOfStudents <= 0) 
		{
			System.out.print("Error: no of students ");
			System.out.println("must not equal to 0!");
			System.out.println("Program Terminating!");
			System.exit(0);
		}
		System.out.print("Enter student marks: ");
		for (i=0; i<numOfStudents; i++)
			totalMarks += sc.nextDouble();
		avgMarks = totalMarks/(double)numOfStudents;
		System.out.print("Average marks = " + avgMarks);
	}
}						


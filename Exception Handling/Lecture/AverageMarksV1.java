import java.util.Scanner;
public class AverageMarksV1 
{
	public static void main(String[] args)
	{
		int i, numOfStudents;
		double totalMarks=0, avgMarks=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		numOfStudents = sc.nextInt();
		System.out.print("Enter student marks: ");
		for (i=0; i<numOfStudents; i++)
			totalMarks += sc.nextDouble();
		avgMarks = totalMarks/(double)numOfStudents;
		System.out.println("Average marks = " + avgMarks);
	}
}								



import java.util.Scanner;
public class AverageMarksV3 
{
	public static void main(String[] args) 
	{
		int i, numOfStudents;
		double totalMarks=0, avgMarks=0;
		Scanner sc = new Scanner(System.in);

		try 
		{
			System.out.print("Enter number of students: ");
			numOfStudents = sc.nextInt();
			if (numOfStudents <= 0) 
				throw new Exception(
					"Error: no of students must not equal to 0!");
			System.out.print("Enter student marks: ");
			for (i=0; i<numOfStudents; i++)
				totalMarks += sc.nextDouble();
			avgMarks = totalMarks/(double)numOfStudents;
			System.out.println("Average marks = " + avgMarks);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("End of program execution!");
		}
	}

}							


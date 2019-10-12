import java.util.Scanner;
public class AverageMarksV5 
{
	public static void main(String[] args) {
		double average;
		try
		{
			average = computeAvgMarks();
			System.out.println("Average marks = " + average);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			//System.exit(0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		finally {
			System.out.println("End of program execution!");
		}
	}
	public static double computeAvgMarks() throws ArithmeticException 
	{
		int i , numOfStudents;
		double totalMarks=0, avgMarks=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		numOfStudents = sc.nextInt();
		if (numOfStudents <= 0) 
			throw new ArithmeticException("Error: no of students must not equal to 0!");
		System.out.print("Enter student marks: ");
		for (i=0; i< numOfStudents; i++)
			totalMarks += sc.nextDouble();
		avgMarks = totalMarks/(double)numOfStudents;
		return avgMarks;
	}
}					



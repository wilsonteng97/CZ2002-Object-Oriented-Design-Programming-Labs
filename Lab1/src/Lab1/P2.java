package Lab1;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Salary: ");
		int salary = in.nextInt();
		System.out.println("Enter Merit points: ");
		int merit = in.nextInt();
		
		char grade;
		
		if (salary<600) {
			grade = 'C';
		}
		else if (salary<650) {
			if (merit<10) grade = 'C';
			else grade = 'B';
		}
		else if (salary<800) {
			if (merit<20) grade = 'B';
			else grade = 'A';
		}
		else {
			grade = 'A';
		}
		
		System.out.println("salary: $" + salary + 
						   ", merit: " + merit + 
						   " --- Grade " + grade);
	}

}

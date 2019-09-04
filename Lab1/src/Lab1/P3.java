package Lab1;
import java.util.Scanner;

public class P3 {
	
	private static final double RATE = 1.82;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Starting: ");
		int starting = in.nextInt();
		System.out.println("Enter Ending: ");
		int ending = in.nextInt();
		System.out.println("Enter Increment: ");
		int increment = in.nextInt();
		
		if (starting>ending || increment==0) {
			System.out.println("starting: " + starting + 
							   ", ending: " + ending + 
							   ", increment: " + increment + "- Error input! ");
			return;
		}
		
		int i=starting;
		
		// for loop
		System.out.println("US$\tS$");
		System.out.println("----------");
		for (i=starting; i<ending+1; i+=increment) {
			System.out.println(i + "\t" + i*RATE);
		}
		
		// while loop
		System.out.println("US$\tS$");
		System.out.println("----------");
		i = starting;
		while (i<ending+1) {
			System.out.println(i + "\t" + i*RATE);
			i+=increment;
		}
		
		// do while loop
		System.out.println("US$\tS$");
		System.out.println("----------");
		i = starting;
		do {
			System.out.println(i + "\t" + i*RATE);
			i+=increment;
		} while (i<ending+1);
	}

}

package Lab1;
import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter height: ");
		int height = in.nextInt();
		int c;

		String a = "AA";
		String b = "BB";
		
		for (int i=1; i<=height; i++) {
			if (i!=1) System.out.println();
			if (i%2==1) c=0;
			else c=1;
			
			for (int j=1; j<=i; j++) {
				if (c%2==0) System.out.print(a);
				else System.out.print(b);
				c++;
			}
		}
	}
}

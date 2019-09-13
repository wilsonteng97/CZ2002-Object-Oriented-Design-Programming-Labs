package lab2p1;
import java.util.Scanner;
import java.util.Random;

public class lab2p1 {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			
			int m, n, digit, ans;
			long n_long, ans_long;
			
			choice = sc.nextInt();
			switch (choice) {
				case 1: /* add mulTest() call */
					mulTest(); break;
				case 2: /* add divide() call */
					
					System.out.print("m = ");
					m = sc.nextInt();
					System.out.print("n = ");
					n = sc.nextInt();
					ans = divide(m, n); 
					System.out.println(m + "/" + n + " = " + ans + "\n"); break;
				case 3: /* add modulus() call */
					System.out.print("m = ");
					m = sc.nextInt();
					System.out.print("n = ");
					n = sc.nextInt();
					ans = modulus(m, n); 
					System.out.println(m + " % " + n + " = " + ans + "\n"); break;
				case 4: /* add countDigits() call */
					do {
						System.out.print("Enter n: ");
						n = sc.nextInt();
						if (n<0)
							System.out.println("n : " + n + " - Error input!!");
					} while (n<0);
					ans = countDigits(n); 
					System.out.println("n : " + n + "- count = " + ans + "\n"); break;
				case 5: /* add position() call */
					System.out.print("Enter n: ");
					n = sc.nextInt();
					System.out.print("Enter digit: ");
					digit = sc.nextInt();
					ans = position(n, digit); 
					System.out.println("position = " + ans); break;
				case 6: /* add extractOddDigits() call */
					do {
						System.out.print("Enter n: ");
						n_long = sc.nextInt();
						if (n_long<0)
							System.out.println("oddDigits = Error input!!");
					} while (n_long<0);
					ans_long = extractOddDigits(n_long); 
					System.out.println("n : " + n_long + "- oddDigits = " + ans_long + "\n"); break;
				case 7: System.out.println("Program terminating ….");
			}
		} while (choice < 7);
		sc.close();
	}
	/* add method code here */
	public static void mulTest() {
		int correct=0, no1, no2, answer;

		for (int i=0;i<5;i++) {
			no1 = (int)(Math.random() * 9 + 1);
			no2 = (int)(Math.random() * 9 + 1);
			
			System.out.print("How much is " + no1 + " times " + no2 + "? ");
			Scanner in = new Scanner(System.in);
			answer = in.nextInt();
			if (answer==no1*no2)
				correct+=1;
			in.close();
		}
		
		System.out.println("........");
		System.out.println(correct + " answers out of 5 correct.\n");
	}
	
	public static int divide(int m, int n) {
		int times=0;
		
		while (m>=n) {
			m-=n;
			times+=1;
		}
		return times;
	}
	
	public static int modulus(int m, int n ) {		
		while (m>=n) {
			m-=n;
		}
		return m;
	}
	
	public static int countDigits(int n) {
		int digits=0;
		while (n!=0) {
			n/=10;
			digits+=1;
		}
		return digits;
	}
	
	public static int position(int n, int digit) {
		int pos = 1, cur;
		while (n!=0) {
			cur = n%10;
			if (cur==digit)
				return pos;
			n/=10;
			pos+=1;
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		long cur, ans=0;
		int oddcount=0;
		
		while (n!=0) {
			cur = n%10;
			if (cur%2==1) {
				ans = ans + (long)(Math.pow(10, oddcount) * cur);
				oddcount+=1;
			}
			n/=10;
		}
		
		if (oddcount==0) {
			return -1;
		}
		return ans;
	}
}


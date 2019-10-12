import java.util.Scanner;
public class IntNonNegativeExceptionApp 
{
	public static void main(String[] args)
	{
		IntNonNegativeExceptionApp sumEx = 
				new IntNonNegativeExceptionApp();
		Scanner sc = new Scanner(System.in);
	
		int inputNum, sum=0;
		System.out.print("Enter total no. of integers: ");
		int total = sc.nextInt();
		for (int i=0; i < total; i++) 
		{
			inputNum = sumEx.getInteger();
			sum += inputNum;
		}
		System.out.println("The sum of integers: " + sum);
	}
	public int getInteger()
	{
		int num=0;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter the integer: ");
			num = sc.nextInt();
			if (num < 0) 
				throw new IntNonNegativeException();
		}
		catch (IntNonNegativeException e) 
		{
				System.out.println(e.getMessage());	
				num = getIntAgain();
		}
		return num;
	}
	public int getIntAgain()
	{
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your input again: ");
			num = sc.nextInt();
			if (num < 0) 
			{
				System.out.println(
					"Error: it must not be a negative integer!");
				System.out.println("Program Terminating!!");
				System.exit(0);
			}
			return num;
	}

}



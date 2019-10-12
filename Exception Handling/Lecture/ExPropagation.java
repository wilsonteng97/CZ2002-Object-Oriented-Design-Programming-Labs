public class ExPropagation 
{
	public static void main(String[] args) 
	{
		System.out.println("Start program execution");
		ExPropagation exp = new ExPropagation();
		exp.method1();
		System.out.println("End of program execution");
	}
	public void method1() 
	{
		System.out.println("Start method1()");
		try 
		{
			method2();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception message: " + e.getMessage());
			System.out.println("Print stack trace: " );
			e.printStackTrace();
		}
		System.out.println("End method1()");
	}
	public void method2() 
	{
		System.out.println("Start method2()");
		method3();
		System.out.println("End method2()");
	}
	public void method3() 
	{
		int[] array = new int[5];
		int i;
		
		System.out.println("Start method3()");
		i = 6;
		array[i] = 10;
		System.out.println("End method3()");
	}
}								


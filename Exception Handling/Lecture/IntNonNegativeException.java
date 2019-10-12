public class IntNonNegativeException extends Exception
{
	public IntNonNegativeException() 
	{
		super("Integer input is a negative number!! ");
	}
	public IntNonNegativeException(String message)
	{
		super(message);
	}
}



import java.io.*;
public class Person implements Serializable 
{
	private String name;
	private int age;
	private double height;

	public Person()
	{
		name = null;
		age = 0;
		height = 0;
	}
	public Person(String aName, int anAge, double aHeight)
	{
		name = aName;
		age = anAge;
		height = aHeight;
	}

	public String toString()
	{
		return ("Name: " + name + "\n" 
				+ "Age: " + age + "\n" 
				+ "Height: " + height);
	}
}


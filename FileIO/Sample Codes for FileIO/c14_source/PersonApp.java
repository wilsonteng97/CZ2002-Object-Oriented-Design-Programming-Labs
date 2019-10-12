import java.io.*;
public class PersonApp 
{
	public static void main(String[] args)
	{
		System.out.println("=====Writing Objects=====");
		ObjectOutputStream ooStream = null;
		try 
		{
			ooStream = new ObjectOutputStream(
			new BufferedOutputStream(
			new FileOutputStream("person.dat")));
		}
		catch (IOException e) 
		{
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}
		Person person1 = new Person("Junrong", 16, 1.76);
		Person person2 = new Person("ChooEng", 17, 1.77);
		Person person3 = new Person("SiuCheung", 18, 1.78);
		try 
		{
			ooStream.writeObject(person1);
			ooStream.writeObject(person2);
			ooStream.writeObject(person3);
			ooStream.close();
		}
		catch (IOException e) 
		{
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}

		System.out.println("=====Reading Objects=====");
		ObjectInputStream oiStream = null;
		try 
		{
			oiStream = new ObjectInputStream(
			new BufferedInputStream(new FileInputStream("person.dat")));
		}
		catch (IOException e) 
		{
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}
		Person output1 = null;
		Person output2 = null;
		Person output3 = null;
		try 
		{
			output1 = (Person)oiStream.readObject();
			output2 = (Person)oiStream.readObject();
			output3 = (Person)oiStream.readObject();
			oiStream.close();
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Class not found! " + e.getMessage());
			System.exit(0);
		}
		catch (IOException e) 
		{
			System.out.println("File IO Error!" + e.getMessage());
			System.exit(0);
		}
		System.out.println(output1.toString());
		System.out.println(output2.toString());
		System.out.println(output3.toString());
	}
}



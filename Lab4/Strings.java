import java.util.Scanner;

public class Strings
{
// --------------------------------------------
// Reads in an array of String objects, sorts them,
// then prints them in sorted order.
// --------------------------------------------
	
/*Every primitive type in Java has an equivalent wrapper class:
	byte has Byte
	short has Short
	int has Integer
	long has Long
	boolean has Boolean
	char has Character
	float has Float
	double has Double
*/
	
/*
===About String Class from Java Documentation===
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public final class String
extends Object
implements Serializable, Comparable<String>, CharSequence

The String class represents character strings. 
All string literals in Java programs, such as "abc", 
are implemented as instances of this class.

Strings are constant; their values cannot be changed after they are created. 
String buffers support mutable strings. Because String objects are immutable they can be shared. 

For example:
     String str = "abc";
 
is equivalent to:
     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
 
Here are some more examples of how strings can be used:
     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
 
The class String includes methods for examining individual characters of the sequence, 
for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string 
with all characters translated to uppercase or to lowercase. 
Case mapping is based on the Unicode Standard version specified by the Character class.
*/
	
public static void main (String[] args)
{
	String[] stringList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print("\nHow many strings do you want to sort? ");
	size = scan.nextInt();
	
	stringList = new String[size];
	System.out.println ("\nEnter the strings...");
	for (int i = 0; i < size; i++)
		stringList[i] = scan.next();
	
	Sorting.insertionSortBigToSmall(stringList);
	System.out.println ("\nYour strings in sorted order...");
	
	for (int i = 0; i < size; i++)
		System.out.print(stringList[i] + " ");
	System.out.println ();
	}
}
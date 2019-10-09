import java.util.Scanner;

public class Numbers
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
	
/*
REASON WHY INITIAL CODE FAILED TO COMPILE
* 
==Datatype of input parameter==
* The Sorting class selectionSort method expects a Comparable type array input,
  however int array was initialized and used as the parameter instead.
 
==SOLUTION==
* Change array type of intList from int to Integer. Java will automatically
  employ autoboxing to convert primitive int variable to Integer (which implements the Comparable Interface)
  while trying to assign int to Integer array intList[]
*/
	
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
===About Integer Class from Java Documentation===
https://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Integer.html

public final class Integer
extends Number (implements Serializable)
implements Comparable<Integer>

The Integer class wraps a value of the primitive type int in an object. 
An object of type Integer contains a single field whose type is int.

In addition, this class provides several methods 
for converting an int to a String and a String to an int, 
as well as other constants and methods useful when dealing with an int.
*/
	
public static void main (String[] args)
{
	Integer[] intList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	
	intList = new Integer[size];
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++)
		intList[i] = scan.nextInt();
	
	Sorting.insertionSortBigToSmall(intList);
	System.out.println ("\nYour numbers in sorted order...");
	
	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	System.out.println ();
	}

/*
===ORIGINAL CODE===
public static void main (String[] args)
{
	int[] intList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	
	intList = new int[size];
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++)
		intList[i] = scan.nextInt();
	
	Sorting.selectionSort(intList);
	System.out.println ("\nYour numbers in sorted order...");
	
	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	System.out.println ();
	}
*/
}
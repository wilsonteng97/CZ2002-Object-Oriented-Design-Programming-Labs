/*
// Java program to Compare two strings 
// lexicographically 
class Compare { 
  
    // This method compares two strings 
    // lexicographically without using 
    // library functions 
    public static int stringCompare(String str1, 
                                    String str2) 
    { 
        for (int i = 0; i < str1.length() &&  
                    i < str2.length(); i++) { 
            if ((int)str1.charAt(i) ==  
                (int)str2.charAt(i)) { 
                continue; 
            }  
            else { 
                return (int)str1.charAt(i) -  
                    (int)str2.charAt(i); 
            } 
        } 
  
        // Edge case for strings like 
        // String 1="Geeky" and String 2="Geekyguy" 
        if (str1.length() < str2.length()) { 
            return (str1.length()-str2.length()); 
        }  
        else if (str1.length() > str2.length()) { 
            return (str1.length()-str2.length()); 
        } 
          
        // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else { 
            return 0; 
        } 
    }
*/


public class SalePerson implements Comparable {

	private String firstName, lastName;
	private int totalSales;
	
	// Constructor
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	// Methods
	public String toString() {
		return this.firstName + ", " + this.lastName + " : " + this.totalSales;
	}
	
	public boolean equals(Object o) {
		if (o.getClass()==this.getClass()) {
			SalePerson s = (SalePerson)o; //downcasting
			// check whether Object o's firstName & lastName are equal to that of the instance's
			return s.firstName==this.firstName && s.lastName==this.lastName;
		}		
		return false;
	}
	
	/*
	===int compareTo(String str2)===
	if (string1 > string2) it returns a positive value.
	if both the strings are equal lexicographically
	i.e.(string1 == string2) it returns 0.
	if (string1 < string2) it returns a negative value.
	*/
	public int compareTo(Object o) {
		if (o.getClass()==this.getClass()) {
			SalePerson s = (SalePerson)o;
			if (this.totalSales==s.totalSales) {
				// Comparing String:
				// returns -1 if this instance's obj has lastName lexographically smaller 
				// than the argument's obj
				return this.lastName.compareTo(s.lastName); 
			}
			else {
				// Comparing Int
				return (this.totalSales < s.totalSales) ? -1 : 1;
			}
		}
		return 2;
	}
	
	// Get methods
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getTotalSales() {
		return this.totalSales;
	}
	
	public static void main(String[] args) {

	}

}

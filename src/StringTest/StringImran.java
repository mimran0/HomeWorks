package StringTest;

public class StringImran {

	public static void main(String[] args) {
		String Imran,Imran2,Imran3;
		Imran="    String can hold 0 OR more charecters AND character means alphabetic leters, numbers, symbols  ";
		Imran2="    String can hold 0 OR more charecters and character means alphabetic leters, numbers, symbols  ";
		Imran3="";
		// 1. Converting texts to uppercase
		System.out.println(Imran.toUpperCase());
		
		// 2. Getting the length of the string
		System.out.println(Imran.length());
		
		// 3. Converts texts to lower case
		System.out.println(Imran.toLowerCase());
		
		//4. removes the whitespace of the string from the beginning and end 
		System.out.println(Imran.trim());
		// 5. gets sub string where beginning number is specified.
		System.out.println(Imran.substring(15));
		// 6. gets sub string where beginning and ending numbers are specified
		System.out.println(Imran.substring(15,20));
		//7. compare 2 strings
		System.out.println(Imran.compareTo("hell0"));
		//8. check if the string starts with a specified text
		System.out.println(Imran.startsWith("    String"));
		//9. Check if the string ends with a specified text
		System.out.println(Imran.endsWith("alphabetic leters, numbers, symbols  "));
        //10. Check if 2 strings are same but ignore lower case, upper case
		System.out.println(Imran.compareToIgnoreCase(Imran2));
		//11. sticks to string together
		System.out.println(Imran.concat(Imran2));
		//12. check if the specified string exist in the search string.
		System.out.println(Imran.contains("can hold 0 OR"));
		//13. Check if the string variable is empty
		System.out.println(Imran3.isEmpty());
		//14. Check if both strings are equal and lower case, upper case does not matter
		System.out.println(Imran.equalsIgnoreCase(Imran2));
		//15. check if both strings are same
		System.out.println(Imran3.contentEquals(""));
		//16. check if the length is 0
		System.out.println(Imran3.isEmpty());
		//17. check the regular expression
		System.out.println(Imran.matches(".*"));
		//18. Convert to array
		System.out.println(Imran.toCharArray());
		//19 returns an array containing byes 
		System.out.println(Imran.getBytes());
		//20 returns the class name
		System.out.println(Imran.getClass());
		
		System.out.println("Checking how github acts if I add this line of code in this file")
		
		
	}

}

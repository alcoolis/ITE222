package week1_2;

/*
 * Description: The program is intended to check whether the string contains all vowels 
 *  
 */
public class Test3Vowel
{
	public static void main(String[] args)
	{
		System.out.println(isAllVowels("eiei")); // true
		System.out.println(isAllVowels("abcdef")); // false
		System.out.println(isAllVowels("aeiou")); // true

		// The program should print the following result
		// true
		// false
		// true
	}

	public static boolean isAllVowels(String string)
	{
		char ch;
		// Write your code here
		// return true if every char in a String is a vowel.
		// return false if one of char in a String is not a vowel.
		for(int i=0; i<string.length(); i++)
		{
			ch=string.charAt(i);
			if(!isVowel(ch))
				return false;
		}
		return true;
	}
	
	private static boolean isVowel(char c)
	{
		return "AEIOUaeiou".indexOf(c) != -1;
	}

}
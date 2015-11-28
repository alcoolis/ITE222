package week1_2;

/***
 * 
 * @author mintra Description: Write the add method
 *
 */
public class Test1Method
{

	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		int result = add(x, y);
		System.out.println(result);
		System.out.println(add(50, 60));

		// The program should print the following result to the scree:
		// 30
		// 110

	}
	
	// Write the method here
	// public static
	private static int add(int a, int b)
	{
		return a+b;
	}


}
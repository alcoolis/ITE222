package week1_2;

/***
 * 
 * @author mintra Description: Write a program to calculate the GPAX
 */
public class Test2ArrayGPAX
{

	public static void main(String[] args)
	{
		// Create an array variable to store the following data
		// Bob's GPA: 3.5, 2.75, 3.21, 3.8, 3.32
		// Tina's GPA: 2.5, 2.75, 2.34, 3.09, 3.2, 3.41, 3.21

		// The program should calculate the GPAX and print the following result
		// Bob's GPAX is 3.316
		// Tina's GPAX is 2.928
		
		double[] bobGpaArray={3.5, 2.75, 3.21, 3.8, 3.32};
		double[] tinaGpaArray={2.5, 2.75, 2.34, 3.09, 3.2, 3.41, 3.21};

		System.out.printf("Bob's GPAX is %.3f \nTina's GPAX is %.3f", calculateGPA(bobGpaArray), calculateGPA(tinaGpaArray));
	}
	
	private static double calculateGPA(double[] array)
	{
		double some=0;
		
		for(int i=0; i<array.length; i++)
			some+=array[i];
			
		return (some/array.length);
	}

}

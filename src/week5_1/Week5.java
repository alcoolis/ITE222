package week5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		List<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
		List<Integer> b = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
		
		
		System.out.println(intersect(a,b));

	}

	private static List<Integer> intersect(List<Integer> list1, List<Integer> list2)
	{
		ArrayList<Integer> result=new ArrayList<>();
		
		for (int item : list1) 
		    if(list2.contains(item))
		    	result.add(item);
		
		return result;
	}
}

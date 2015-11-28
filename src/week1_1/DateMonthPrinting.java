package week1_1;

public class DateMonthPrinting
{

	public static void main(String[] args)
	{
		int date=1;
		int counter=0;
		
		System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n\n", "S", "M", "T", "W", "T", "F", "S");
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if(counter<2)
				{
					System.out.print("      ");
				}
				else
				{
					System.out.printf("%6d", date);
					date++;
				}
				counter++;

				if(date>31)
					break;
			}
			System.out.println("\n");
		}
	}

}

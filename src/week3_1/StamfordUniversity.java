package week3_1;

public class StamfordUniversity
{

	public static void main(String[] args)
	{
		StamfordStudent student1 = new StamfordStudent();
		
		// Set value of student1
		student1.setFirstname("John");
		student1.setLastname("Doe");
		student1.setGpa(2.8);
		student1.setFee(56300);

		// Display student1
		System.out.println(student1);
		
		student1.calculateNewFee();

		System.out.println(student1);
		
		ITStudent student2 = new ITStudent();
		
		student2.setFirstname("John2");
		student2.setLastname("Doe2");
		student2.setGpa(3.8);
		student2.setFee(58800);
		student2.setHasLaptop(true);
		
		System.out.println(student2);
		
		student2.calculateNewFee();

		System.out.println(student2);
	}

}

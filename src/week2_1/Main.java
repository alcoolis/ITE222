package week2_1;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Hotel hotel=new Hotel("CnProd", 5, 120, 119, false, false);
		
		Car car1=new Car("BMW", "red", 120, false);
		Car car2=new Car("Mercedes", "white", 100, true);

		System.out.println(hotel);
		System.out.println(car1);
		System.out.println(car2);
		
		hotel.makeBooking();
		hotel.setHasGym(true);
		
		System.out.println(hotel);

		hotel.makeBooking();
		
		hotel.cancelBooking();
		hotel.setHasPool(true);
		
		System.out.println(hotel);
	}
}

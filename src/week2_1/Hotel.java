package week2_1;

public class Hotel
{
	private String hotelName;
	private int hotelRating;
	private int hotelRooms;
	private int bookedRooms;
	private boolean hasGym;
	private boolean hasPool;
	
	
	public Hotel(String name, int rating, int rooms, int bkRooms, boolean gym, boolean pool)
	{
		this.hotelName=name;
		this.hotelRating=rating;
		this.hotelRooms=rooms;
		this.bookedRooms=bkRooms;
		this.hasGym=gym;
		this.hasPool=pool;
	}
	
	public void makeBooking()
	{
		if(checkAvailability(true))
			this.increaseBookedRooms();
		else
			System.out.println("Sorry no rooms available!\n");
	}
	
	public void cancelBooking()
	{
		System.out.println("A booking was canceled!\n");
		this.decreaseBookedRooms();
	}
	
	//adding a flag to overload checkAvailability 
	public boolean checkAvailability(boolean flag)
	{
		return this.bookedRooms<this.hotelRooms;
	}
	
	public int checkAvailability()
	{
		return this.hotelRooms-this.bookedRooms;
	}
	
	
	public String getHotelName()
	{
		return hotelName;
	}
	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}
	public int getHotelRating()
	{
		return hotelRating;
	}
	public void setHotelRating(int hotelRating)
	{
		this.hotelRating = hotelRating;
	}
	public int getHotelRooms()
	{
		return hotelRooms;
	}
	public void setHotelRooms(int hotelRooms)
	{
		this.hotelRooms = hotelRooms;
	}
	public int getBookedRooms()
	{
		return bookedRooms;
	}
	public void setBookedRooms(int bookedRooms)
	{
		this.bookedRooms = bookedRooms;
	}
	public boolean getHasGym()
	{
		return hasGym;
	}
	public void setHasGym(boolean hasGym)
	{
		this.hasGym = hasGym;
	}
	public boolean getHasPool()
	{
		return hasPool;
	}
	public void setHasPool(boolean hasPool)
	{
		this.hasPool = hasPool;
	}	
	
	//setBookedRooms is prone to making errors so i create two methods to increase decrease bookedRooms
	private void increaseBookedRooms()
	{
		this.bookedRooms++;
	}
	private void decreaseBookedRooms()
	{
		this.bookedRooms--;
	}
	
	public String toString()
	{
		String result;
		
		if(this.getBookedRooms()>1 && this.getBookedRooms()<this.getHotelRooms())
			result= "The "+this.getHotelName()+" hotel has " + this.getHotelRooms() + " rooms from which " + this.getBookedRooms()+" are already booked!";
		else if(this.getBookedRooms()==1)
			result= "The "+this.getHotelName()+" hotel has " + this.getHotelRooms() + " rooms from which only " + this.getBookedRooms()+" is booked!";
		else if(this.getBookedRooms()==0)
			result= "The "+this.getHotelName()+" hotel has " + this.getHotelRooms() + " rooms from which no one is booked!";
		else
			result= "The "+this.getHotelName()+" hotel has " + this.getHotelRooms() + " and is fully booked!!!";
		
		if(this.getHasGym() && this.getHasPool())
			result+="\nIt has also a Gym and a Pool!";
			else if(this.getHasGym())
				result+="\nIt has also a Gym but not a Pool!";
			else if(this.getHasPool())
				result+="\nIt has also a Pool but not a Gym!";
			else
				result+="\nIt has nor a Pool neither a Gym!";
		
		return result+"\n";
	}
}

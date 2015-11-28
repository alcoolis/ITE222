package week2_1;

public class Car
{
	private String carConstructor;
	private String carColor;
	private int carSpeed;
	private boolean isDiesel;
	
	
	public Car(String constructor, String color, int speed, boolean diesel)
	{
		this.carConstructor=constructor;
		this.carColor=color;
		this.carSpeed=speed;
		this.isDiesel=diesel;
	}
	
	public void changeSpeed(int speed)
	{
		carSpeed+=speed;
	}
	
	public String getCarConstructor()
	{
		return carConstructor;
	}
	public void setCarConstructor(String constructor)
	{
		this.carConstructor = constructor;
	}
	public String getCarColor()
	{
		return carColor;
	}
	public void setCarColor(String color)
	{
		this.carColor = color;
	}
	public int getCarSpeed()
	{
		return carSpeed;
	}
	public void setCarSpeed(int speed)
	{
		this.carSpeed = speed;
	}
	public boolean isDiesel()
	{
		return isDiesel;
	}
	public void setDiesel(boolean diesel)
	{
		this.isDiesel = diesel;
	}
	
	public String toString()
	{
		return "This is a "+this.getCarColor()+" " + this.getCarConstructor() + " car which current speed is " + this.getCarSpeed()+"!\n";
	}
}

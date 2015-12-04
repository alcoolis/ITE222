package week3_1;

public class ITStudent extends StamfordStudent
{
	private boolean hasLaptop = false;
	
	public ITStudent()
	{
		super();
		
	}

	public boolean getHasLaptop()
	{
		return hasLaptop;
	}

	public void setHasLaptop(boolean hasLaptop)
	{
		this.hasLaptop = hasLaptop;
	}
	
	public void calculateNewFee()
	{
		if (this.gpa < 3.0)
		{
			this.setFee(this.getFee()+(this.getFee()*0.2));
		}
		else if(this.gpa > 3.5)
		{
			this.setFee(this.getFee()-(this.getFee()*0.1));
		}
	}
	
	public String toString()
	{
		if (this.getHasLaptop())
			return super.toString()+", this IT student has a laptop.";
		else
			return super.toString()+", this IT student doesn't have a laptop.";
	}
}

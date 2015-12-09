package week4_1;

public class RatingBar
{
	private String id;
	private int numStar;
	
	public RatingBar()
	{
		
	}
	
	public RatingBar(String id, int numStar)
	{
		this.id=id;
		this.numStar=numStar;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public int getNumStar()
	{
		return numStar;
	}
	public void setNumStar(int numStar)
	{
		this.numStar = numStar;
	}
	
	@Override
	public String toString()
	{
		return "RatingBar " + id;
	}
}

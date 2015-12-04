package week3_1;

public class StamfordStudent
{
	private String firstname;
	private String lastname;
	protected double gpa;
	private double fee;

	// Constructor
	public StamfordStudent()
	{

	}

	// Getter/Setter
	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	public double getFee()
	{
		return fee;
	}

	public void setFee(double fee)
	{
		this.fee = fee;
	}

	// toString()
	public String toString()
	{
		String str = "";
		str += "First name: " + this.firstname;
		str += ", Last name: " + this.lastname;
		str += ", GPA: " + this.gpa;
		str += ", Student fee: " + this.fee;
		return str;
	}

	public void calculateNewFee()
	{
		if (this.gpa < 3.0)
		{
			this.fee += this.fee * 0.1;
		}
	}

}

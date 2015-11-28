package week2_2;

public class Supplier
{
	private String supplierName;
	private String supplierEmail;
	
	public Supplier(String name, String email)
	{
		this.supplierEmail=email;
		this.supplierName=name;
	}
	
	public void contact()
	{
		System.out.println(this.toString());
	}
	
	public String getSupplierName()
	{
		return supplierName;
	}

	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}

	public String getSuplierEmail()
	{
		return supplierEmail;
	}

	public void setSuplierEmail(String supplierEmail)
	{
		this.supplierEmail = supplierEmail;
	}

	
	public String toString()
	{
		return "The email of supplier "+this.getSupplierName()+" is "+this.getSuplierEmail()+"\n";
	}
}

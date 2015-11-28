package week2_2;

public class StamfordSouvenir
{
	private static double VAT = 0.07;

	private String productName;
	private double productPrice;
	private int numberInStock;
	private Supplier productSupplier;

	public static void main(String[] args)
	{
		Supplier souvSupplier=new Supplier("miltos", "miltiadis.altintzis@students.stamford.edu");
		
		souvSupplier.contact();
		
		StamfordSouvenir souvenir = new StamfordSouvenir("Stamford T-Shirt",10.0, 30,souvSupplier);

		souvenir.getNumberInStock();
		souvenir.buy(20);
		souvenir.getNumberInStock();
		souvenir.buy(12);
		souvenir.increaseNumberInStock(20);
		souvenir.buy(12);
		souvenir.getNumberInStock();
	}

	public StamfordSouvenir(String prodnm, double prodpr, int numbStc, Supplier sup)
	{
		productName = prodnm;
		productPrice = prodpr;
		numberInStock = numbStc;
		productSupplier = sup;
	}

	public StamfordSouvenir(String prodnm, double prodpr, Supplier sup)
	{
		productName = prodnm;
		productPrice = prodpr;
		numberInStock = 0;
		productSupplier = sup;
	}

	public static double getVAT()
	{
		return VAT;
	}

	public static void setVAT(double vAT)
	{
		VAT = vAT;
		System.out.println("VAT adjusted to " + VAT + "%");
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public double getProductPrice()
	{
		return productPrice;
	}

	public void setProductPrice(double productPrice)
	{
		this.productPrice = productPrice;
	}

	public int getNumberInStock()
	{
		System.out.println("Number of " + this.getProductName() + " in stock: " + this.numberInStock + "\n");
		return numberInStock;
	}

	public Supplier getProductSupplier()
	{
		return productSupplier;
	}

	public void setProductSupplier(Supplier productSupplier)
	{
		this.productSupplier = productSupplier;
	}

	public void increaseNumberInStock(int numberInStock)
	{
		this.numberInStock += numberInStock;

		System.out.println("Number of " + this.getProductName() + " is increased.");
		this.getNumberInStock();
	}

	public void buy(int numberOfProduct)
	{
		if (numberOfProduct > numberInStock)
		{
			System.out.println("Not enough products in stock.\n");
		}
		else
		{
			this.numberInStock -= numberOfProduct;

			String line = "------------------------------\n";
			String resultPrint = "Thank you for Your order!\n";

			resultPrint += this;
			resultPrint += String.format("%-20s %s\n", "Supplier name:",this.getProductSupplier().getSupplierName());
			resultPrint += String.format("x%-20d$%.1f\n", numberOfProduct,(numberOfProduct * this.getProductPrice()));
			resultPrint += line;
			resultPrint += String.format("%-20s %.0f%s \n", "VAT", (StamfordSouvenir.getVAT() * 100),"%");
			resultPrint += line;
			resultPrint += String.format("%-20s $%.1f \n", "Total:",(numberOfProduct * this.getProductPrice())+ ((numberOfProduct * this.getProductPrice()) * StamfordSouvenir.getVAT()));
			resultPrint += line;

			System.out.println(resultPrint);
		}
	}

	public String toString()
	{
		return String.format("%-20s($%.1f)\n", productName, productPrice);
	}
}
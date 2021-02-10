package medicineProject;
import java.util.Date;

public abstract class Medicine
{
	double price;
	Date expiryDate;

	public Medicine() {
		super();

	}
	public Medicine(double price, Date expiryDate) 
	{
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public void getDetails()
	{
		System.out.println("Price = "+price+" Expiry Date = "+expiryDate);
	}
	public abstract void displayLabel();
}
package medicineProject;
import java.util.Date;

public class Syrup extends Medicine
{

	public Syrup()
	{
		super();
		price=500;
		expiryDate=new Date();
	}

	public Syrup(double price, Date expiryDate) 
	{
		super(price, expiryDate);
	
	}

	@Override
	public void displayLabel() 
	{
		
		System.out.println("Syrup name(xyz)"+ "\n"+"Before use shake it well");

	}

}
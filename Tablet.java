package medicineProject;
import java.util.Date;
public class Tablet extends Medicine
{
	public Tablet() {
		super();
		price=500;
		expiryDate=new Date();
	}

	public Tablet(double price, Date expiryDate) 
	{
		super(price, expiryDate);
		
	}

	@Override
	public void displayLabel() 
	{
		
		System.out.println("Tablet name(xyz)"+"\n"+"Preserve in a cool dry place");

	}

}
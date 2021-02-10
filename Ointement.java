package medicineProject;

import java.util.Date;

public class Ointement extends Medicine
{


	public Ointement()
	{
		super();
		price=500;
		expiryDate=new Date();


	}

	public Ointement(double price, Date expiryDate)
	{
		super(price, expiryDate);

	}

	@Override
	public void displayLabel() 
	{

		System.out.println("Ointement name(xyz)"+"\n"+"use it for external  only");
	}

}
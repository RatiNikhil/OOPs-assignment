package oopsAssignment;

public class TestCustomer {
	public static void main(String[] args)
	{
		Customer cust=new Customer("Rahul",new Address("1st Main BTM Layout","Banglore"),new Address("1st Main HSR Layout","Banglore"));
		System.out.println(cust.getCustomerDetails());
	}

}
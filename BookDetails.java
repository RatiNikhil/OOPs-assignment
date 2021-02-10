package encuplationAndinheritance;

public class BookDetails {
	public static void main(String[] args) 
	{

		Book b=new Book();
		b.setBookNo(101);
		b.setTitle("Core Java Volume I – Fundamentals");
		b.setAuthor("Cay S. Horstmann");
		b.setPrice(100);
		System.out.println(b);

	}

}
package encuplationAndinheritance;
public class EngBookTest {
		public static void main(String[] args) {
			EngBooks book=new EngBooks();
			book.setBookNo(10);
			book.setAuthor("Cay S. Horstmann");
			book.setTitle("Core Java Volume I – Fundamentals");
			book.setPrice(500);
			book.setCategory("Java Programming Language");
			System.out.println(book);
		}

	}
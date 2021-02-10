package encuplationAndinheritance;

public class EngBooks extends Book{
	private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return super.toString()+"EngBooks [category=" + category + "]";
	}
}
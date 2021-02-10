package interfaceshape;
import interfaceshape.Rectangle;
import interfaceshape.Square;
public class ShapeTest
{

	public static void main(String[] args) 
	{
		Square Square=new Square(5);
		Rectangle rect=new Rectangle(12,8);
		Square.calcArea();
		Square.calcPeri();
		rect.calcArea();
		rect.calcPeri();

	}
}

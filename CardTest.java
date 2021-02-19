package inheritanceAndabstraction;
import java.util.Scanner;
public class CardTest {

	public static void main(String[] args)
	{
		PrepaidCard p=new TravelCard(3457,5600,1000,5);
		Reward r=new TravelCard();
		Scanner sc=new Scanner(System.in);
		System.out.println(p);
		System.out.println("Amount  in USA Dollars= "+ p.availableBalance/60);	
		System.out.println("Enter the swipe amount in USA Dollars =");
		double amount=sc.nextDouble();
		p.swipeCard(amount);

		System.out.println("Earn Reward Points= "+r.rewards(amount * 60));
	}
}
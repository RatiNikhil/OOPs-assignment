package inheritanceAndabstraction;

public class TravelCard extends PrepaidCard implements Reward {

	int rewardPoints = 0;

	public TravelCard(int cardNo, double availableBalance, double swipeLimit, int rewardPoints) {
		super(cardNo, availableBalance, swipeLimit);
		this.rewardPoints = rewardPoints;
	}

	public TravelCard() {
		super();

	}

	@Override
	public boolean swipeCard(double amount) 
	{

		amount = amount * 60;
		if (amount <= swipeLimit && amount <= availableBalance) {
			double remainBalance = availableBalance - amount;
			remainBalance = remainBalance - (5/100) * remainBalance;
			System.out.println("After swipe card Balance= " + remainBalance);
			System.out.println("Transaction Successfull");
			return true;
		} 
		else
		{

			System.out.println("Transaction cannot be done");

			return false;
		}

	}

	@Override
	public int rewards(double amount) 
	{
		while (amount >= 100) {
			rewardPoints += 5;
			amount = amount - 100;
		}

		return rewardPoints;
	}

}
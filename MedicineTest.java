package medicineProject;
import java.util.Random;
public class MedicineTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random(); 
		Medicine arr[]=new Medicine[5];
		arr[0]= new Tablet();
		arr[1]= new Syrup();
		arr[2]= new Ointement();
		int rand_arr = rand.nextInt(3); 
		Medicine m=arr[rand_arr] ;
		m.displayLabel();
		m.getDetails();
	}

}
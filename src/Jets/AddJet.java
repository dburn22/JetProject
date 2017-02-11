package Jets;
import java.util.Scanner;

public class AddJet {
	public String add() {
		Scanner kb = new Scanner(System.in);
		String add;
		System.out.println("What jet would you like to add to our battalion?");
		add = kb.next();
		System.out.println("You have sucessfully added the: " + add + " to the battallion");
		return add;

	}


}

package Jets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddJet {
	public static String add() {
		List<String> addingANewJet = new ArrayList<>();
		//Jet();

		Scanner kb = new Scanner(System.in);
		String newJet;
		System.out.println("What jet would you like to add to our battalion?");
		newJet = kb.next();
		//addingANewJet.add(newJet);

		System.out.println("You have sucessfully added the: " + newJet + " to the battallion");
		return newJet;

	}


}


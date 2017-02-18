package Jets;

import java.util.Scanner;

public class JetMenu {
	static jetList j1 = new jetList();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		j1.loadJets();
		int k;
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Welcome to Campbell Army Airfield. \n Please take a look "
					+ "at our menu options to begin your tour of the Battalion!\n");
			System.out.println("\t\t*************************************");
			System.out.println("  \t\t     1. List fleet                 ");
			System.out.println("  \t\t     2. View fastest jet           ");
			System.out.println("  \t\t     3. View jet with longest range");
			System.out.println("  \t\t     4. Add a jet to Fleet          ");
			System.out.println("  \t\t     5. Quit                        ");
			System.out.println("\t\t*************************************");
			System.out.println("\t\t*************************************");
			System.out.println("     \t\t Enter a menu number.            ");
			k = kb.nextInt();

			if (k < 1 || k > 6) {
				System.out.println("This is NOT a menu option. Pick another number.");

			}

			if (k == 5) {
				System.out.println("Thank you for visiting Campbell Army Airfield. Goodbye!");
				keepGoing = false;
			}
			if (k == 4) {
				System.out.println("Welcome to the control center! \n Enter the jet you wish to add to our battallion");
				j1.add();

			}
			if (k == 3) {
				System.out.println("Here are the jets in our battalion with the longest ranges!");
				j1.longestJet();

			}

			if (k == 2) {
				System.out.println("The fastest jet in the battalion! ");
				j1.fastestJet();
				// for (int i = 0; i < fastest.length; i++) {
				// System.out.println(fastest[i]);
				// fastest f = new fastest();
				// System.out.println(f.toString());

			}

			if (k == 1) {
				System.out.println("Here are all the jets in our battalion please \n select one to learn more!");
				for (int i = 0; i < j1.jetlist.length; i++) {
					if (j1.jetlist[i] != null) {
						System.out.println(j1.jetlist[i]);

					}
				}
			}

		}
	}
}

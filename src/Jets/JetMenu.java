package Jets;

import java.util.Scanner;

public class JetMenu {
	static jetList j = new jetList();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k;
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Welcome to Campbell Army Airfield. \n Please take a look "
					+ "at our menu options to begin your tour of the Battalion!");
			System.out.println("1. List fleet");
			System.out.println("2. View fastest jet");
			System.out.println("3. View jet with longest range");
			System.out.println("4. Add a jet to Fleet");
			System.out.println("5. Quit");
			System.out.println("Enter a menu number.");
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
				AddJet aJ = new AddJet();
				String add = aJ.add();


			}
			if (k == 3) {
				System.out.println("Here are the jets in our battalion with the longest ranges!");
				String[] longest = j.longestJet();
				for(int i = 0; i < longest.length; i++){
					System.out.println(longest[i]);
				}
			}
			if (k == 2) {
				System.out.println("The fastest jets in the battalion are \n listed from fastest to slowest! ");
				String[] fastest = j.fastestJet();
				for (int i = 0; i < fastest.length; i++) {
					System.out.println(fastest[i]);

				}

			}
			if (k == 1) {
				System.out.println("Here are all the jets in our battalion please \n select one to learn more!");
				String[] list = j.getJetlist();
				for (int i = 0; i < list.length; i++) {
					System.out.println(list[i]);

				}
			}

		}

	}
}

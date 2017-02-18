package Jets;

import java.util.Scanner;

public class jetList {
	public static int i = 0;
	Jet[] jetlist = new Jet[8];

	public void loadJets() {

		jetlist[0] = new Jet("Stealth Bomber", 628, 6897, 2);
		jetlist[1] = new Jet("F-18", 1190, 2069, 98);
		jetlist[2] = new Jet("F-35", 1119, 1379, 6.1);
		jetlist[3] = new Jet("Airforce One (737)", 631, 8077, 4);
		jetlist[4] = new Jet("A10 Warthog", 439, 800, 18);

	}

	public void add() {
		for (int i = 0; i < jetlist.length; i++) {
			if (jetlist[i] == null) {
				Scanner kb = new Scanner(System.in);

				System.out.println("What jet would you like to add to our battalion?");
				String newJet = kb.next();

				System.out.println("What is the Jet speed?");
				double speed = kb.nextDouble();

				System.out.println("What is the Jet Range?");
				double range = kb.nextDouble();

				System.out.println("What does the Jet cost?");
				double cost = kb.nextDouble();

				System.out.println("You have sucessfully added the to the battallion");

				jetlist[i] = new Jet(newJet, speed, range, cost);
				break;
			}
		}

	}

	public Jet[] getJetlist() {
		return jetlist;
	}

	public void setJetlist(Jet[] jetlist) {
		this.jetlist = jetlist;
	}

	public void fastestJet() {
		float largestValue = 0f;
		int largest = 0;

		for (int i = 0; i < jetlist.length; i++) {
			if (jetlist[i] != null) {

				if (jetlist[i].getSpeed() > largestValue) {
					largestValue = (float) jetlist[i].getSpeed();
					jetlist[largest] = jetlist[i];

				}

			}
		}
		System.out.println(jetlist[largest]);
	}

	public void longestJet() {
		float largestValue = 0f;
		int longest = 0;

		for (int i = 0; i < jetlist.length; i++) {
			if (jetlist[i] != null) {

				if (jetlist[i].getRange() > largestValue) {
					largestValue = (float) jetlist[i].getRange();
					jetlist[longest] = jetlist[i];

				}
			}
		}
		System.out.println(jetlist[longest]);
	}
}

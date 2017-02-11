package Jets;

public class jetList {
	String[] jetlist = new String[5];

	jetList() {
		fastestJet();

		jetlist[0] = "Stealth Bomber-\n" + "Price: 2B" + "Speed: 628 MPH" + "Range: 6,897m";
		jetlist[1] = "F-18-\n" + "Price: 98 Million" + "Speed: 1,190 MPH" + "Range: 2,069m";
		jetlist[2] = "F-35-\n" + "Price: 6.1B" + "Speed: 1,119 MPH" + "Range: 1,379m";
		jetlist[3] = "Airforce One (737)-" + "Price: 4B" + "Speed: 631 MPH" + "Range: 8,077m";
		jetlist[4] = "A10 Warthog" + "Price: 18 Million" + "Speed: 439 MPH" + "Range: 800m";

	}

	public String[] getJetlist() {
		return jetlist;
	}

	public void setJetlist(String[] jetlist) {
		this.jetlist = jetlist;
	}

	public String[] fastestJet() {
		String[] fastest = new String[5];

		fastest[0] = "F-18-\n Speed: 1,190 MPH";

		fastest[1] = "F-35-\n Speed: 1,119 MPH";

		fastest[2] = "Airforce One (737)- Speed: 631 MPH";
		fastest[3] = "Stealth Bomber-\n Speed: 628 MPH";

		fastest[4] = "A10 Warthog Speed: 439 MPH";

		return fastest;

	}

	public String[] longestJet() {
		String[] longest = new String[5];

		longest[0] = "Airforce One (737)-Range: 8,077m";
		longest[1] = "Stealth Bomber-\nRange: 6,897m";
		longest[2] = "F-18-\n Range: 2,069m";
		longest[3] = "F-35 -Range: 1,379m";
		longest[4] = "A10 Warthog Range: 800m";
		return longest;

	}
}
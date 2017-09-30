package be.pxl.generics.opdracht4;

import java.util.*;

public class LijstUtilityTest {

	public static void main(String[] args) {
		List<String> lijst = new ArrayList<>();
		String woord = "abc";

		LijstUtility.maakLijst(lijst, woord);
		LijstUtility.printLijst(lijst);
		lijst.add(2, "beer");
		lijst.add(4, "olifant");
		lijst.add(6, "kanarie");
		lijst.add(8, "selfie");
		LijstUtility.printLijst(lijst);
		LijstUtility.keerOmEnPrintLijst(lijst);
		LijstUtility.sortList(lijst);
		LijstUtility.printLijst(lijst);
	}
}

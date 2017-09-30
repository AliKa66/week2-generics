package be.pxl.generics.opdracht4;

import java.util.*;

public class IntegerLijstUtility {

	private static List<Integer> lijst;
	private static final int MAX_AANTAL_GETALLEN = 10;

	public static void maakIntegerLijst(int getal) {
		lijst = new ArrayList<>();
		Integer getalInInteger = Integer.valueOf(getal);
		for (int aantalGetallen = 0; aantalGetallen < MAX_AANTAL_GETALLEN; aantalGetallen++) {
			lijst.add(getalInInteger);
		}
	}

	public static void printIntegerLijst() {

		if (lijst != null) {
			for (int index = 0; index < lijst.size(); index++) {
				System.out.println("getal " + (index + 1) + ": " + lijst.get(index));
			}
		}
	}
}

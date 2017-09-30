package be.pxl.generics.opdracht4;

import java.util.*;

public class LijstUtility {
	private static final int MAX_AANTAL_OBJECTEN = 10;

	public static <T> void maakLijst(List<T> lijst, T object) {
		for (int aantalGetallen = 0; aantalGetallen < MAX_AANTAL_OBJECTEN; aantalGetallen++) {
			lijst.add(object);
		}
	}

	public static <T> void printLijst(List<T> lijst) {
			for (int index = 0; index < lijst.size(); index++) {
				System.out.print(lijst.get(index).toString() + " ");
			}
			System.out.println();
	}

	public static <T> void keerOmEnPrintLijst(List<T> lijst) {
			for (int index = lijst.size() - 1; index >= 0; index--) {
				System.out.print(lijst.get(index).toString() + " ");
			}
			System.out.println();
	}

	public static <T extends Comparable<T>> void sortList(List<T> lijst) {
		for (int numberOfLoop = 0; numberOfLoop < lijst.size(); numberOfLoop++) {
			for (int index = 0; index < lijst.size() - 1; index++) {
				if (lijst.get(index).compareTo(lijst.get(index + 1)) > 0) {
					Collections.swap(lijst, index, index + 1);
				}
			}
		}
	}
}

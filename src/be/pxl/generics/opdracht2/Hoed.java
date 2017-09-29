package be.pxl.generics.opdracht2;

public class Hoed<T extends Dier> {

	private T dier;
	private boolean eersteKeerGekeken = true;

	public Hoed(T dier) {
		this.dier = dier;
	}

	public T kijk() {
		if (!eersteKeerGekeken) {
			return dier;
		} else {
			eersteKeerGekeken = false;
			return null;
		}
	}
}

package Stufe3;

public class Buf extends Gatter {

	public Buf(int delay) {
		super(delay);

	}

	public void berechne() {

	}

	public void berechne(int t) {
		boolean ergebnis = true;
		for (Signal s : eingangssignale) {
			ergebnis = s.getValue();
			new Event(ausgangssignal, t += delay, ergebnis);
		}
	}
}

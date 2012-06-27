package Stufe3;

public class Or extends Gatter {

	public Or(int eingänge, int delay) {
		super(eingänge, delay);
	}

	public void berechne() {
		boolean ergebnis = true;
		for (Signal s : eingangssignale) {
			ergebnis = ergebnis || s.getValue();
		}
		//ergebnis = ergebnis;
		if (ergebnis != ausgangssignal.getValue()) {
			ausgangssignal.setValue(ergebnis);
		}
	}

	public void berechne(int t) {
		boolean ergebnis = true;
		for (Signal s : eingangssignale) {
			ergebnis = ergebnis || s.getValue();
		}
		//ergebnis = ergebnis;
		{
			if (ergebnis != ausgangssignal.getValue()) { // nur ein event
															// erzeugen, wenn
															// sich der wert
															// geändert hat
				new Event(ausgangssignal, t += delay, ergebnis);
			} else { // System.out.println("keine änderung");
			}
		}
	}
}
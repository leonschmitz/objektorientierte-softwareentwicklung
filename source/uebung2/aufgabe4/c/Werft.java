package uebung2.aufgabe4.c;

import uebung2.aufgabe4.a.Schiff;
import uebung2.aufgabe4.b.Schifffahrtsamt;

public class Werft {

    public void produziereSchiff(String name, Double laenge, Schifffahrtsamt amt) {
        final String kennzeichen = Schifffahrtsamt.getKennzeichen();
        final Schiff schiff = new Schiff(name, laenge);
        schiff.setKennzeichen(kennzeichen);
        amt.registriereSchiff(schiff);
    }

}

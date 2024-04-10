package org.model;

public class Ticket {

    private int km;
    private int eta;

    //COSTRUTTORE
    public Ticket(int km, int eta) {
        if (km <= 0 || eta <= 0)
            throw new IllegalArgumentException("I Km e L'eta' del passeggero devono essere maggiori di 0");
        this.km = km;
        this.eta = eta;
    }

    //METODI
    public double calcolaPrezzoBase(int km) {
        if (km <= 0) {
            throw new IllegalArgumentException("I Km non possono essere <= 0");
        }
        return km * 0.21;
    }

    public double calcolaPrezzoJunior(int km, int eta) {
        if (km <= 0) {
            throw new IllegalArgumentException("I Km non possono essere <= 0");
        }

        double prezzoSenzaSconto = km * 0.21;

        int sconto = 0;
        if (eta < 18) {
            sconto = 20;
        } else {
            throw new IllegalArgumentException();
        }

        return prezzoSenzaSconto - (prezzoSenzaSconto * sconto / 100);
    }

    public double calcolaPrezzoSenior(int km, int eta) {
        if (km <= 0) {
            throw new IllegalArgumentException("I Km non possono essere <= 0");
        }
        
        double prezzoSenzaSconto = km * 0.21;

        int sconto = 0;
        if (eta > 65) {
            sconto = 40;
        } else {
            throw new IllegalArgumentException();
        }

        return prezzoSenzaSconto - (prezzoSenzaSconto * sconto / 100);
    }
}

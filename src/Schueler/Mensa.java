package Schueler;

public class Mensa {

    String bezeichnung;
    int tische;
    int plaetze;
    String oefnungszeiten;
    String tagesgericht1;
    String tagesgericht2;


    public Mensa(String bezeichnung, int tische, int plaetze, String oefnungszeiten, String tagesgericht1, String tagesgericht2) {
        this.bezeichnung = bezeichnung;
        this.tische = tische;
        this.plaetze = plaetze;
        this.oefnungszeiten = oefnungszeiten;
        this.tagesgericht1 = tagesgericht1;
        this.tagesgericht2 = tagesgericht2;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setNumber(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

}

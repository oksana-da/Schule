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
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getTische() {
        return tische;
    }
    public void setTische(int tische) {
        this.tische = tische;
    }

    public int getPlaetze() {
        return plaetze;
    }
    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    public String getOefnungszeiten() {
        return oefnungszeiten;
    }
    public void setOefnungszeiten(String oefnungszeiten) {
        this.oefnungszeiten = oefnungszeiten;
    }

    public String getTagesgericht1() {
        return tagesgericht1;
    }
    public void setTagesgericht1(String tagesgericht1) {
        this.tagesgericht1 = tagesgericht1;
    }

    public String getTagesgericht2() {
        return tagesgericht2;
    }
    public void setTagesgericht2(String tagesgericht2) {
        this.tagesgericht2 = tagesgericht2;
    }


}

package Schule;

public class Schulhof {

    String bezeichnung;
    String ort;
    String geraete;


    public Schulhof(String bezeichnung, String ort, String geraete) {
        this.bezeichnung = bezeichnung;
        this.ort = ort;
        this.geraete = geraete;
    }


    public String getOrt(){
        return ort;
    }
    public void setOrt(String ort){
        this.ort = ort;
    }

    public String getGeraete(){
        return geraete;
    }
    public void setGeraete(String geraete){
        this.geraete = geraete;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }


    public void pause(){
        System.out.print("\nErste Pause um 10:30 in: ");
    }


}

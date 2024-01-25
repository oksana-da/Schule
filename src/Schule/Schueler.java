package Schule;

public class Schueler {

    private String name;
    private String adresse;
    int age;
    private int klasse;
    int iq;
    double note;
    String mittagessen;


    public Schueler(String name, String adresse, int age, int klasse, int iq, double note, String mittagessen) {
        this.name = name;
        this.adresse = adresse;
        this.age = age;
        this.klasse = klasse;
        this.iq = iq;
        this.note = note;
        this.mittagessen = mittagessen;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getKlasse() {
        return klasse;
    }
    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }

    public double getNote() {
        return note;
    }
    public void setNote(double note) {
        this.note = note;
    }

    public String getMittagessen() {
        return mittagessen;
    }
    public void setMittagessen(String mittagessen) {
        this.mittagessen = mittagessen;
    }



    public void essen(){
        System.out.print("- Ich habe hunger.");
        System.out.println(" Gehe in die Mensa.");
    }


}

package Schueler;

public class Lehrer {

    String name;
    String adresse;
    int age;
    int klasse;
    int iq;


    public Lehrer(String name, String adresse, int age, int klasse, int iq) {
        this.name = name;
        this.adresse = adresse;
        this.age = age;
        this.klasse = klasse;
        this.iq = iq;
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



    public void lehren(){
        System.out.print("unterrichtet folgende klassen: ");
    }


}

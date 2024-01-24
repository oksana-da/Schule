package Schueler;

public class Schule {
    public static void main(String[] args) {

        Schueler schuler1 = new Schueler("Anna", "Hamburg", 8, 3,120,1.6,"Mittagessen");
        Schueler schuler2 = new Schueler("Olga", "Hamburg", 6, 1,150,2.3,"Mittagessen");
        Schueler schuler3 = new Schueler("Anton", "Berlin", 9, 4,150,2.0,"kein Mittagessen");
        Schueler schuler4 = new Schueler("Oksana", "Hamburg", 6, 1,124,3.3,"Mittagessen");
        Schueler schuler5 = new Schueler("Tom", "Hamburg", 5, 1,129,1.7,"kein Mittagessen");
        Schueler schuler6 = new Schueler("Amely", "Hamburg", 7, 2,126,2.9,"Mittagessen");
        Schueler schuler7 = new Schueler("Adrian", "Köln", 6, 1,148,3.1,"kein Mittagessen");
        Schueler schuler8 = new Schueler("Hans", "Hamburg", 8, 3,161,2.1,"Mittagessen");
        Schueler schuler9 = new Schueler("Diana", "Hamburg", 5, 1,111,1.8,"kein Mittagessen");
        Schueler schuler10 = new Schueler("Bern", "Hamburg", 6, 1,127,2.9,"kein Mittagessen");

        Lehrer lehrer1 = new Lehrer("Victoria","Hamburg", 34, 1, 180);
        Lehrer lehrer2 = new Lehrer("Daniel","Hamburg", 28, 2, 190);
        Lehrer lehrer3 = new Lehrer("Mila","Hamburg", 45, 3, 179);
        Lehrer lehrer4 = new Lehrer("Klaus","Hamburg", 31, 4, 180);
        Lehrer lehrer5 = new Lehrer("Lana","Hamburg", 29, 5, 168);

        Schulhof shulhof1 = new Schulhof("Spielplatz");
        Schulhof schulhof2 = new Schulhof("Bewegungsgelände");

        Mensa mensa1 = new Mensa("Mensa");

        System.out.printf("%s ist %s Jahre alt. Sie ist in %s. Klasse und hat Note %s.", schuler1.name,schuler1.age, schuler1.klasse, schuler1.note);
        System.out.printf("\n%s ist %s Jahre alt und unterrichtet die %s. Klasse.", lehrer3.name, lehrer3.age, lehrer3.klasse);
        System.out.printf("\n%s ist auf dem %s. Heute hat er %s.", schuler5.name, shulhof1.bezeichnung, schuler5.mittagessen);
        System.out.printf("\n%s ist beim %s in der %s.", schuler2.name, schuler2.mittagessen, mensa1.bezeichnung);
    }
}

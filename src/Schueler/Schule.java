package Schueler;

public class Schule {
    public static void main(String[] args) {

        Schueler schuler1 = new Schueler("Anna", "Hamburg", 8, 3, 120, 1.6, "Mittagessen");
        Schueler schuler2 = new Schueler("Olga", "Hamburg", 6, 1, 150, 2.3, "Mittagessen");
        Schueler schuler3 = new Schueler("Anton", "Berlin", 9, 4, 150, 2.0, "kein Mittagessen");
        Schueler schuler4 = new Schueler("Oksana", "Hamburg", 6, 1, 124, 3.3, "Mittagessen");
        Schueler schuler5 = new Schueler("Tom", "Hamburg", 5, 1, 129, 1.7, "kein Mittagessen");
        Schueler schuler6 = new Schueler("Amely", "Hamburg", 7, 2, 126, 2.9, "Mittagessen");
        Schueler schuler7 = new Schueler("Adrian", "Köln", 6, 1, 148, 3.1, "kein Mittagessen");
        Schueler schuler8 = new Schueler("Hans", "Hamburg", 8, 3, 161, 2.1, "Mittagessen");
        Schueler schuler9 = new Schueler("Diana", "Hamburg", 5, 1, 111, 1.8, "kein Mittagessen");
        Schueler schuler10 = new Schueler("Bern", "Hamburg", 6, 1, 127, 2.9, "kein Mittagessen");

        Lehrer lehrer1 = new Lehrer("Victoria", "Hamburg", 34, 1, 180);
        Lehrer lehrer2 = new Lehrer("Daniel", "Hamburg", 28, 2, 190);
        Lehrer lehrer3 = new Lehrer("Mila", "Hamburg", 45, 3, 179);
        Lehrer lehrer4 = new Lehrer("Klaus", "Hamburg", 31, 4, 180);
        Lehrer lehrer5 = new Lehrer("Lana", "Hamburg", 29, 5, 168);

        Schulhof schulhof1 = new Schulhof("Spielplatz");
        Schulhof schulhof2 = new Schulhof("Bewegungsgelände");

        Mensa mensa1 = new Mensa("Mensa");

        System.out.printf("%s ist %s Jahre alt. Sie ist in %s. Klasse und hat Note %s.", schuler1.getName(), schuler1.getAge(), schuler1.getKlasse(), schuler1.getNote());
        System.out.printf("\n%s ist %s Jahre alt und unterrichtet die %s. Klasse.", lehrer3.getName(), lehrer3.getAge(), lehrer3.getKlasse());
        System.out.printf("\n%s ist auf dem %s. Heute hat er %s.", schuler5.getName(), schulhof1.getBezeichnung(), schuler5.getMittagessen());

        System.out.printf("\n\n%s: \n", schuler2.name);
        schuler3.essen();
        System.out.printf("%s ist beim %s in der %s.", schuler2.getName(), schuler2.getMittagessen(), mensa1.getBezeichnung());

        System.out.printf("\n\n%s ", lehrer1.name);
        lehrer1.lehren();
        System.out.printf("%s", lehrer1.klasse);

        schulhof1.pause();
        System.out.printf("%s\n", schulhof1.bezeichnung);
    }
}

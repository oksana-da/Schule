package Schule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Schule {
    public static void main(String[] args) {


        Scanner eingabe = new Scanner(System.in);

        List<Schueler> schuelerList = new ArrayList<>();
        schuelerList.add(new Schueler("Anna", "Hamburg", 8, 3, 120, 1.6, "Mittagessen"));
        schuelerList.add(new Schueler("Olga", "Hamburg", 6, 1, 150, 2.3, "Mittagessen"));
        schuelerList.add(new Schueler("Anton", "Berlin ", 9, 4, 150, 2.0, "kein Mittagessen"));
        schuelerList.add(new Schueler("Oksana", "Hamburg", 6, 1, 124, 3.3, "Mittagessen"));
        schuelerList.add(new Schueler("Tom", "Hamburg", 5, 1, 129, 1.7, "kein Mittagessen"));
        schuelerList.add(new Schueler("Amely", "Hamburg", 7, 2, 126, 2.9, "Mittagessen"));
        schuelerList.add(new Schueler("Adrian", "Köln", 6, 1, 148, 3.1, "kein Mittagessen"));
        schuelerList.add(new Schueler("Anna", "Hamburg", 6, 1, 161, 2.1, "Mittagessen"));
        schuelerList.add(new Schueler("Diana", "Hamburg", 5, 1, 111, 1.8, "kein Mittagessen"));
        schuelerList.add(new Schueler("Bern", "Hamburg", 6, 1, 127, 2.9, "kein Mittagessen"));


        List<Lehrer> lehrerList = new ArrayList<>();
        lehrerList.add(new Lehrer("Victoria", "Hamburg", 34, 1, 180));
        lehrerList.add(new Lehrer("Daniel", "Hamburg", 28, 2, 190));
        lehrerList.add(new Lehrer("Mila", "Hamburg", 45, 3, 179));
        lehrerList.add(new Lehrer("Klaus", "Hamburg", 31, 4, 180));
        lehrerList.add(new Lehrer("Lana", "Hamburg", 29, 5, 168));

        Schulhof schulhof1 = new Schulhof("Spielplatz", "vor der Schule", "Rutsche, Bänke");
        Schulhof schulhof2 = new Schulhof("Bewegungsgelände", "hinter der Schule", "Sonnenschutz, Trampoline");

        Mensa mensa1 = new Mensa("Mensa", 30, 180, "12:00 - 14:00", "Pasta", "Pizza");

        System.out.printf("%s ist %s Jahre alt. Sie ist in %s. Klasse und hat Note %s.", schuelerList.get(0).getName(),
                schuelerList.get(0).getAge(), schuelerList.get(0).getKlasse(), schuelerList.get(0).getNote());
        System.out.printf("\n%s ist %s Jahre alt und unterrichtet die %s. Klasse.", lehrerList.get(2).getName(),
                lehrerList.get(2).getAge(), lehrerList.get(2).getKlasse());
        System.out.printf("\n%s ist auf dem %s. Heute hat er %s.", schuelerList.get(4).getName(),
                schulhof1.getBezeichnung(), schuelerList.get(4).getMittagessen());

        System.out.printf("\n\n%s: \n", schuelerList.get(1).getName());
        schuelerList.get(0).essen();
        System.out.printf("%s ist beim %s in der %s.", schuelerList.get(1).getName(),
                schuelerList.get(1).getMittagessen(), mensa1.getBezeichnung());

        System.out.printf("\n\n%s ", lehrerList.get(0).getName());
        lehrerList.get(0).lehren();
        System.out.printf("%s", lehrerList.get(0).getKlasse());

        schulhof1.pause();
        System.out.printf("%s\n", schulhof1.getBezeichnung());


        System.out.print("\nGeben Sie den Namen des Schulers an: ");
        String getName = eingabe.nextLine();
        schuelerList.forEach(schueler -> {
            if (schueler.getName().equals(getName)) {
                System.out.println(String.format("%s ist %s Jahre alt. Sie ist in %s. Klasse und hat Note %s.",
                        schueler.getName(), schueler.getAge(), schueler.getKlasse(), schueler.getNote()));
            }
        });


        System.out.print("\nGeben Sie die Stadt des Schulers an: ");
        String stadt = eingabe.nextLine();
        schuelerList.forEach(schueler -> {
            if (schueler.getAdresse().equals(stadt)) {
                System.out.println(String.format("%s, %s Jahre alt. %s. Klasse, Note %s.",
                        schueler.getName(), schueler.getAge(), schueler.getKlasse(), schueler.getNote()));
            }
        });


        System.out.print("\nGeben Sie den Namen des Lehrers an: ");
        String lehrerName = eingabe.nextLine();
        lehrerList.forEach(lehrer -> {
            if (lehrer.getName().equals(lehrerName)) {
                System.out.printf("%s unterrichtet die %s. Klasse.\n", lehrer.getName(), lehrer.getKlasse());
            }
        });


    }
}

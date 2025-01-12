import Interfaces.Brightness;
import Interfaces.Show;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Brightness, Show {
    private int brightness;
    private int durata;

    public Immagine (String title, int durata) {
        super(title);
        this.durata = durata;

    }

    @Override
    public void brightnessUp() {
        System.out.println("Inserisci un valore da 2 a 5 per aumentare la luminosità e premi invio");
        Scanner scanner = new Scanner(System.in);
        int brightness = scanner.nextInt();
        System.out.println("Luminosità impostata a " + brightness);
        scanner.close();
    }

    @Override
    public void brightnessDown() {
        System.out.println("Inserisci un valore da 4 a 1 per diminuire la luminosità e premi invio");
        Scanner scanner2 = new Scanner (System.in);
        int brightness = scanner2.nextInt();
        System.out.println("Luminosità impostata a " + brightness);
        scanner2.close();
    }

    @Override
    public void show() {
        System.out.println("Inserisci il livello di luminosità");
        Scanner luminosita = new Scanner (System.in);
        int lum = luminosita.nextInt();
        for (int d=0;d<durata;d++) {System.out.print(title);
            for (int i = 0; i < lum; i++)
                System.out.print(" *");
            System.out.println();
        }


    }
}

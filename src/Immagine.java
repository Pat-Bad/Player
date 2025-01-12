import Interfaces.Brightness;
import Interfaces.Show;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Brightness, Show {
    private int brightness;
    private int durata;

    public Immagine (String title, int brightness) {
        super(title);
        this.brightness = brightness;

    }

    @Override
    public void brightnessUp() {
        System.out.println("Inserisci un valore per aumentare la luminosità e premi invio");
        Scanner scanner = new Scanner(System.in);
        int brightness = scanner.nextInt();
        System.out.println("Luminosità impostata a " + brightness);

    }

    @Override
    public void brightnessDown() {
        System.out.println("Inserisci un valore e premi invio");
        Scanner scanner2 = new Scanner (System.in);
        int brightness = scanner2.nextInt();
        System.out.println("Luminosità impostata a " + brightness);

    }

    @Override
    public void show() {

        for (int d=0;d<brightness;d++) {System.out.print(title);
            for (int i = 0; i < brightness; i++)
                System.out.print(" *");
            System.out.println();
            brightnessUp();
            brightnessDown();

        }


    }
}

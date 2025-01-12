import Interfaces.Brightness;

import java.util.Scanner;

public class RegistrazioneVideo extends ElementoMultimediale implements Volume, Brightness {
    private final int durata;
    private int volume;
    private int brightness;

    public RegistrazioneVideo(String title, int durata) {
        super(title);
        this.durata = durata;
    }
    @Override
    public void volumeUp() {
        System.out.println("Inserisci un valore per aumentare il volume e premi invio");
        Scanner scannerUp = new Scanner(System.in);
        int volume = scannerUp.nextInt();
        System.out.println("Volume impostato a " + volume);

    }

    @Override
    public void volumeDown() {
        System.out.println("Inserisci un valore per abbassare il volume e premi invio");
        Scanner scannerDown = new Scanner(System.in);
        int volume = scannerDown.nextInt();
        System.out.println("Volume impostato a " + volume);

    }
    @Override
    public void brightnessUp() {
        System.out.println("Inserisci un valore per alzare la luminosità e premi invio");
        Scanner scanner = new Scanner(System.in);
        int brightness = scanner.nextInt();
        System.out.println("Luminosità impostata a " + brightness);

    }

    @Override
    public void brightnessDown() {
        System.out.println("Inserisci un valore per abbassare la luminosità e premi invio");
        Scanner scanner2 = new Scanner(System.in);
        int brightness = scanner2.nextInt();
        System.out.println("Luminosità impostata a " + brightness);

    }

    public void play() {
        System.out.println("Inserisci il volume");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();

        System.out.println("Inserisci il livello di luminosità");

        int brightness = scanner.nextInt();

        for (int i = 0; i < durata; i++) {
            System.out.print(title);
            for (int j = 0; j < volume; j++)
                System.out.print(" !");
            for (int k = 0; k < brightness; k++)
                System.out.print(" *");
            System.out.println();
            volumeUp();
            volumeDown();
            brightnessUp();
            brightnessDown();
        }
    }






}

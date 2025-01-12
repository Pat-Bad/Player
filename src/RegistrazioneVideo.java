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

    public void play() {
        System.out.println("Inserisci il volume");
        Scanner volume = new Scanner(System.in);
        int vol = volume.nextInt();

        System.out.println("\n Inserisci il livello di luminosità");
        Scanner luminosita = new Scanner(System.in);
        int brightness = luminosita.nextInt();

        for (int i = 0; i < durata; i++) {
            System.out.print(title);
            for (int j = 0; j < vol; j++)
                System.out.print(" !");
            for (int k = 0; k < brightness; k++)
                System.out.print(" *");
            System.out.println();
        }
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
        Scanner scanner2 = new Scanner(System.in);
        int brightness = scanner2.nextInt();
        System.out.println("Luminosità impostata a " + brightness);
        scanner2.close();
    }


    @Override
    public void volumeUp() {
        System.out.println("Inserisci un valore da 2 a 5 per aumentare il volume e premi invio");
        Scanner scannerUp = new Scanner(System.in);
        int volume = scannerUp.nextInt();
        System.out.println("Volume impostato a " + volume);
        scannerUp.close();
    }

    @Override
    public void volumeDown() {
        System.out.println("Inserisci un valore da 1 a 4 per diminuire il volume e premi invio");
        Scanner scannerDown = new Scanner(System.in);
        int volume = scannerDown.nextInt();
        System.out.println("Volume impostato a " + volume);
        scannerDown.close();
    }

}

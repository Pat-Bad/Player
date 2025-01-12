import Interfaces.Play;

import java.util.Scanner;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {

    private final int durata;

    public RegistrazioneAudio(String title, int durata) {
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
    public void play() {
        System.out.println("Inserisci il volume");
        Scanner volume = new Scanner(System.in);
        int vol = volume.nextInt();

        for (int i = 0; i < durata; i++) {
            System.out.print(title);
            for (int j = 0; j < vol; j++)
                System.out.print("!");

            System.out.println();
        }
        volumeUp();
        volumeDown();
    }
}

import java.util.Scanner;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume{
    private int volume;

    public RegistrazioneAudio(String title) {
        super(title);
    }

    public RegistrazioneAudio(String title, int volume) {
        super(title);
        this.volume = volume;
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

    @Override
    public void play(int volume) {
        for (int i=0; i<volume; i++)
            System.out.println("!");

    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        /*System.out.println("Inserisci il titolo e premi invio");
        String title = scanner.nextLine();

        System.out.println("Inserisci la durata e premi invio");
        int durata = scanner.nextInt();

        RegistrazioneAudio audio1 = new RegistrazioneAudio(title, durata);
        audio1.play();
        scanner.close();*/


        /*System.out.println("Inserisci il titolo e premi invio");
        String videoTitle = scanner.nextLine();

        System.out.println("Inserisci la durata e premi invio");
        int videoDuration = scanner.nextInt();

        RegistrazioneVideo video1 = new RegistrazioneVideo(videoTitle,videoDuration);
        video1.play();*/

        System.out.println("Inserisci il titolo dell'immagine");
        String title = scanner.nextLine();

        System.out.println("Inserisci il livello di luminosità");
        int brightness = scanner.nextInt();


        Immagine immagine1 = new Immagine (title, brightness);
        immagine1.show();

    }

}
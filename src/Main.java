import java.util.Scanner;

/*Buongiorno, non sono riuscita a far sì che i titoli degli elementi siano al massimo cinque.
Suppongo avrei dovuto creare un array in cui andare a inserire i vari titoli. Purtroppo non ce l'ho fatta.*/

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
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


    Immagine immagine1 = new Immagine(title, brightness);
    immagine1.show();
}


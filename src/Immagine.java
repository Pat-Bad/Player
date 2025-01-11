import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Brightness {
    private int brightness;

    public Immagine (String title) {
        super(title);
        this.brightness = brightness;
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


    public void show(int brightness) {
        for (int i=0; i<brightness; i++)
            System.out.println("*");



    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio registrazione = new RegistrazioneAudio("prova", 5);
        System.out.println(registrazione);
        
        //registrazione.volumeUp();
        //registrazione.volumeDown();
        int volume;
        registrazione.play(3);


    }

}
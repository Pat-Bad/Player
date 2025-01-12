import java.util.Scanner;

public abstract class ElementoMultimediale {
    public String title;

    public ElementoMultimediale(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String toString(){
        return "Titolo dell'elemento: " + title;
    }
}

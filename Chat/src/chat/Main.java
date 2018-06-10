package chat;
import java.lang.Thread;

public class Main {
    public static void main (String[] args) {
        Printa read = new Printa();
        Thread threadPrinta = new Thread(read);
        threadPrinta.start();
    }
    
}

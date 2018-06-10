package chat;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.lang.Thread;

public class Chat {
    public static void main(String[] args) throws IOException {
        try (Socket cliente = new Socket("143.107.231.103", 12345)) {
            System.out.println("LZanguetin conectou-se");
            
            try (Scanner teclado = new Scanner(System.in); 
                    PrintStream saida = new PrintStream(cliente.getOutputStream())) {
                
                while (teclado.hasNextLine()) {
                    saida.println(teclado.nextLine());
                }
                
            }
        }
    }
}
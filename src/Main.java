import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.print("Digita la parola o frase da contare: ");
            String parola = s.nextLine();

            if (parola.equals("esci")) {
                System.out.println("Grazie per aver usato il programma");
                break;
            } else if (parola.isEmpty()) {
                System.out.println("Nessuna parola o frase digidata!");
            } else {
                System.out.println("La parola/frase contiene " + parola.length() + " caratteri");
            }
        }
        s.close();
    }
}
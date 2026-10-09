package uppgift;

import java.util.Scanner;

public class main3000 {
    public static void main(String[] args) {

        TextCounter counter = new TextCounter();

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv valfri text. Skriv stop när du är klar.");

        //Kör så länge användaren inte skriver stop.
        while (!counter.hasStopp()) {
            String text = scan.nextLine();

            //Skickar användarens text till TextCounter
            counter.count(text);

        }
        //Skriver ut resultatet
        System.out.println("Antal rader: " + counter.getRows());
        System.out.println("Antal tecken: " + counter.getLetters());
        System.out.println("Antal ord: " + counter.getWordCount());
        System.out.println("Längsta ordet: " + counter.getLongestWord());

        scan.close();
    }
}

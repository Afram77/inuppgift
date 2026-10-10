package uppgift;
//Klassen uppgift

//Håller reda på räkningen
public class TextCounter {

//Attribut
    private int rows;
    private int letters;
    private int wordCount;
    private String longestWord;
    private boolean stopp;

    //Konstruktorn
    public TextCounter() {
        this.rows = 0;
        this.letters = 0;
        this.wordCount = 0;
        this.longestWord = "";
        this.stopp = false;
    }
    //Tar emot text från användaren
    public void count(String text) {

        //Kontrollerar om ordet är stop
        if (text.toLowerCase().equals("stop")) {
            stopp = true;
            return;
        }
        //Texten som användaren skriver läggs i en Array - words
        String[] words = text.split(" ");

        //Loopen går igenom arrayen
        for (int i = 0; i < words.length; i++) {
            wordCount ++;

            //Söker och sparar det längsta ordet
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        rows += 1;
        letters += text.length();
    }

    //Returnerar antal rader
    public int getRows() {
        return rows;
    }

    //Returnerar antal tecken
    public int getLetters() {
        return letters;
    }

    //Returnerar antal ord
    public int getWordCount() {
        return wordCount;
    }

    //Returnerar längsta ordet
    public String getLongestWord() {
        return longestWord;
    }

    //Kontrollerar om användaren skrivit stop
    public boolean hasStopp() {
        return stopp;
    }
}



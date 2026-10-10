package uppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestData {

  @Test
    public void testCount5Row() {
    //Testar 5 rader

    //Skapar ett object
    TextCounter counter = new TextCounter();

    //5 vars loop
    for(int i = 0; i < 5; i++) {

     //Skickar test texten till räknaren
     counter.count("Det här är min text");
    }
    //Antal rader som räknaren räknat
    int actual = counter.getRows();

    //Förväntade rader
    int expected = 5;

    //Kontrollerar resultatet mot förväntat värde
    assertEquals(expected, actual);
  }

  @Test
  public void testCount14Letters() {
    //Testar 14 tecken

    //Skapar ett object
    TextCounter counter = new TextCounter();

    //Skickar test texten till räknaren
    counter.count("Hejsan Svejsan");

    //Antal tecken som räknaren räknat
    int actual = counter.getLetters();

    //Förväntade tecken
    int expected = 14;

    //Kontrollera om resultatet mot förväntad värde
    assertEquals(expected, actual);
  }

  @Test
  public void testCount4Words() {
    //Testar 4 ord

    TextCounter counter = new TextCounter();

    counter.count("Hej hur mår du");

    int actual = counter.getWordCount();
    int expected = 4;

    assertEquals(expected, actual);
  }

  @Test
  public void testLongestWord() {
    //Testar längsta ordet

    TextCounter counter = new TextCounter();

    counter.count("Hejsan hur mår du?");

    String actual = counter.getLongestWord();
    String expected = "Hejsan";

    assertEquals(expected, actual);
  }

  @Test
  public void testStop() {
    //Testar stop

    TextCounter counter = new TextCounter();

    counter.count("stop");

    boolean actual = counter.hasStopp();
    boolean expected = true;

    assertEquals(expected, actual);
  }

}



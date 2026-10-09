package uppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestData {

  @Test
    public void testCount5Row() {

    TextCounter counter = new TextCounter();

    //Arrange
    String text = "Det här är min text";

    //Act
    counter.count(text);
    counter.count(text);
    counter.count(text);
    counter.count(text);
    counter.count(text);

    int actual = counter.getRows();
    int expected = 5;

    //Assert
    assertEquals(expected, actual);

  }
  @Test
  public void testCount14Letters() {

    TextCounter counter = new TextCounter();
    String text = "Hejsan Svejsan";

    counter.count(text);

    int actual = counter.getLetters();
    int expected = 14;

    assertEquals(expected, actual);
  }

  @Test
  public void testCount4Words() {

    TextCounter counter = new TextCounter();

    String text = "Hej hur mår du";

    counter.count(text);

    int actual = counter.getWordCount();
    int expected = 4;

    assertEquals(expected, actual);
  }

  @Test
  public void testLongestWord() {

    TextCounter counter = new TextCounter();

    String text = "Hejsan hur mår du?";

    counter.count(text);

    String actual = counter.getLongestWord();
    String expected = "Hejsan";

    assertEquals(expected, actual);
  }

  @Test
  public void testStop() {

    TextCounter counter = new TextCounter();

    String text = "stop";

    counter.count(text);

    boolean actual = counter.hasStopp();
    boolean expected = true;

    assertEquals(expected, actual);
  }

}



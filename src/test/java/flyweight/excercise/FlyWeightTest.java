package flyweight.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyWeightTest {

    @Test
    public void mine()
    {
        Sentence s = new Sentence("alpha beta gamma");
        s.getWord(1).capitalize = true;
        assertEquals("alpha BETA gamma", s.toString());
    }

    @Test
    public void suggested()
    {
        Sentence2 s = new Sentence2("alpha beta gamma");
        s.getWord(1).capitalize = true;
        assertEquals("alpha BETA gamma", s.toString());
    }
}
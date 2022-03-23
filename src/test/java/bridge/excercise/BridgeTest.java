package bridge.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    public void mine()
    {
//        assertEquals("Drawing Square as lines",
//                new Square(new VectorRenderer()).toString());
    }

    @Test
    public void suggested()
    {
        assertEquals("Drawing Square as lines",
                new Square2(new VectorRenderer2()).toString());
    }
}
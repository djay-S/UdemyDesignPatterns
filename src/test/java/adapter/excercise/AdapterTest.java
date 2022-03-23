package adapter.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    public void mine()
    {
        Square sq = new Square(11);
        SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(sq);
        assertEquals(121, adapter.getArea());
    }

    @Test
    public void suggested()
    {
        Square2 sq = new Square2(11);
        SquareToRectangleAdapter2 adapter = new SquareToRectangleAdapter2(sq);
        assertEquals(121, adapter.getArea());
    }
}
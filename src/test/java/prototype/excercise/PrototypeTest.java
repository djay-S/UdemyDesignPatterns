package prototype.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    public void mine()
    {
        Line line1 = new Line(
                new Point(3, 3),
                new Point(10, 10)
        );

        Line line2 = line1.deepCopy();
        line1.start.x = line1.end.x = line1.start.y = line1.end.y = 0;

        assertEquals(3, line2.start.x);
        assertEquals(3, line2.start.y);
        assertEquals(10, line2.end.x);
        assertEquals(10, line2.end.y);
    }

    @Test
    public void suggested()
    {
        Line2 line1 = new Line2(
                new Point2(3, 3),
                new Point2(10, 10)
        );

        Line2 line2 = line1.deepCopy();
        line1.start.x = line1.end.x = line1.start.y = line1.end.y = 0;

        assertEquals(3, line2.start.x);
        assertEquals(3, line2.start.y);
        assertEquals(10, line2.end.x);
        assertEquals(10, line2.end.y);
    }
}
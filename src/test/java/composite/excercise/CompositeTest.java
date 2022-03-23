package composite.excercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    public void mine()
    {
        SingleValue singleValue = new SingleValue(11);
        ManyValues otherValues = new ManyValues();
        otherValues.add(22);
        otherValues.add(33);
        assertEquals(66,
                new MyList(List.of(singleValue, otherValues)).sum());
    }

    @Test
    public void suggested()
    {
        SingleValue2 singleValue = new SingleValue2(11);
        ManyValues2 otherValues = new ManyValues2();
        otherValues.add(22);
        otherValues.add(33);
        assertEquals(66,
                new MyList2(List.of(singleValue, otherValues)).sum());
    }
}
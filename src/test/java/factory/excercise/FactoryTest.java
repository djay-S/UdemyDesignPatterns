package factory.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    public void mine()
    {
        PersonFactory pf = new PersonFactory();

        Person p1 = pf.createPerson("Chris");
        assertEquals("Chris", p1.name);
        assertEquals(0, p1.id);

        Person p2 = pf.createPerson("Sarah");
        assertEquals(1, p2.id);
    }

    @Test
    public void suggessted()
    {
        PersonFactory2 pf = new PersonFactory2();

        Person2 p1 = pf.createPerson("Chris");
        assertEquals("Chris", p1.name);
        assertEquals(0, p1.id);

        Person2 p2 = pf.createPerson("Sarah");
        assertEquals(1, p2.id);
    }
}
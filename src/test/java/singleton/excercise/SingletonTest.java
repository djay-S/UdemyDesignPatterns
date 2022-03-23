package singleton.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SingletonTest {

    @Test
    public void mine()
    {
        Object obj = new Object();
        assertTrue(SingletonTester.isSingleton(() -> obj));
        assertFalse(SingletonTester.isSingleton(Object::new));
    }

    @Test
    public void suggested()
    {
        Object obj = new Object();
        assertTrue(SingletonTester2.isSingleton(() -> obj));
        assertFalse(SingletonTester2.isSingleton(Object::new));
    }
}
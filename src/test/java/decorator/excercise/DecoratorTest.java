package decorator.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    public void mine()
    {
        Dragon dragon = new Dragon();

        assertEquals("flying", dragon.fly());
        assertEquals("too young", dragon.crawl());

        dragon.setAge(20);

        assertEquals("too old", dragon.fly());
        assertEquals("crawling", dragon.crawl());
    }

    @Test
    public void suggested()
    {
        Dragon2 dragon = new Dragon2();

        assertEquals("flying", dragon.fly());
        assertEquals("too young", dragon.crawl());

        dragon.setAge(20);

        assertEquals("too old", dragon.fly());
        assertEquals("crawling", dragon.crawl());
    }
}
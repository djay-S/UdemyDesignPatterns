package builder.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    private String preprocess(String text)
    {
        return text.replace("\r\n", "\n").trim();
    }

    @Test
    public void emptyTestMine() {
        CodeBuilder cb = new CodeBuilder("Foo");
        assertEquals("public class Foo\n{\n}",
                preprocess(cb.toString()));
    }

    @Test
    public void personTestMine()
    {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        assertEquals("public class Person\n{\n" +
                        "  public String name;\n" +
                        "  public int age;\n}",
                preprocess(cb.toString()));
    }

    @Test
    public void emptyTestSuggested() {
        CodeBuilder cb = new CodeBuilder("Foo");
        assertEquals("public class Foo\n{\n}",
                preprocess(cb.toString()));
    }

    @Test
    public void personTestSuggested()
    {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        assertEquals("public class Person\n{\n" +
                        "  public String name;\n" +
                        "  public int age;\n}",
                preprocess(cb.toString()));
    }
}
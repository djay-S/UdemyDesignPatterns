package builder.excercise;

import java.util.Map;
import java.util.HashMap;

/*
* You are asked to implement the Builder design pattern for rendering simple chunks of code.
* Sample use of the builder you are asked to create:
* CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
* System.out.println(cb);
*
* The expected output of the above code is:
* public class Person
* {
*   public String name;
*   public int age;
* }
*
* Please observe the same placement of curly braces and use two-space indentation.
 * */
class CodeBuilder {

    private String className;
    private Map<String, String> properties = new HashMap<>();

    public CodeBuilder(String className)
    {
        this.className =  className;
    }

    public CodeBuilder addField(String name, String type)
    {
        this.properties.putIfAbsent(name, type);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("public class %s", this.className));
        sb.append("\n{\n");
        this.properties.entrySet()
                .stream()
                .forEach( props -> {
                    sb.append(String.format("  public %s %s;\n", props.getValue(), props.getKey()));
                });
        sb.append("}");
        return sb.toString();
    }
}
package factory.excercise;

class Person2
{
    public int id;
    public String name;

    public Person2(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory2
{
    private int id = 0;

    public Person2 createPerson(String name)
    {
        return new Person2(id++, name);
    }
}
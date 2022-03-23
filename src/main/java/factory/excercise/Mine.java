package factory.excercise;

/*
* You are given a class called Person . The person has two fields: id and name.
* Please implement a non static PersonFactory that has a createPerson()  method that takes a person's name and returns a new instance of Person
*
* The id of the person returned should be set as a 0-based index of the object created by that factory.
* So, the first person the factory makes should have id=0, second id=1 and so on.
 * */
class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory
{
    private int id = 0;
    public Person createPerson(String name)
    {
        // todo
        Person person = new Person(id, name);
        id++;
        return person;
    }
}

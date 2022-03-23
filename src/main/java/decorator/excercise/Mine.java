package decorator.excercise;

/*
* The following code scenario shows a Dragon  which is both a Bird and a Lizard.
* Complete the Dragon's implementation. Take special care when implementing setAge().
 * */
class Bird
{
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard
{
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Dragon
{
    private int age;
    Lizard l;
    Bird b;
    public void setAge(int age)
    {
        // todo
        this.age = age;
    }
    public String fly()
    {
        // todo
        b = new Bird();
        b.age = this.age;
        return b.fly();
    }
    public String crawl()
    {
        // todo
        l = new Lizard();
        l.age = this.age;
        return l.crawl();
    }
}
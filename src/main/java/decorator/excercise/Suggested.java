package decorator.excercise;

class Bird2
{
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard2
{
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Dragon2
{
    private int age;
    private Bird2 bird = new Bird2();
    private Lizard2 lizard = new Lizard2();
    public void setAge(int age)
    {
        this.age = bird.age = lizard.age = age;
    }
    public String fly()
    {
        return bird.fly();
    }
    public String crawl()
    {
        return lizard.crawl();
    }
}
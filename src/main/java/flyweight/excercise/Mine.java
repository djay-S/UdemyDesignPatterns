package flyweight.excercise;

class Sentence
{
    public String t;
    WordToken wt;
    public Sentence(String plainText)
    {
        // todo
        this.t = plainText;
    }

    public WordToken getWord(int index)
    {
        // todo
        wt = new WordToken(index);
        return wt;

    }

    @Override
    public String toString()
    {
        // todo
        String[] ts = t.split(" ");
        String[] res = new String[ts.length];
        for(int j = 0; j < ts.length; j++) {
            String str = ts[j];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(wt.capitalize && j == wt.i) {
                    c = Character.toUpperCase(c);
                }
                sb.append(c);
            }
            res[j] = sb.toString();
        }
        return String.join(" ", res);
    }

    public class WordToken
    {
        public boolean capitalize;
        public int i;
        public WordToken (int i) {
            this.i = i;
        }
    }
}

/*
* You are given a class called Sentence, which takes a string such as "hello world".
* You need to provide a method called getWord()  that returns a WordToken  which can be used to capitalize a particular word in the sentence.
* */
class Demo {
    public static void main(String[] args) {
        var sentence = new Sentence2("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence);
    }
}
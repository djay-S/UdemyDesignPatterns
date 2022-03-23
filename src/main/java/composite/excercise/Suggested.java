package composite.excercise;

import java.util.*;

interface ValueContainer2 extends Iterable<Integer> {}

class SingleValue2 implements ValueContainer2
{
    public int value;

    public SingleValue2(int value)
    {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return Collections.singleton(value).iterator();
    }
}

class ManyValues2 extends ArrayList<Integer> implements ValueContainer2
{
}


class MyList2 extends ArrayList<ValueContainer2>
{
    public MyList2(Collection<? extends ValueContainer2> c)
    {
        super(c);
    }

    public int sum()
    {
        int result = 0;
        for (ValueContainer2 c : this)
        {
            for (int i : c)
            {
                result += i;
            }
        }
        return result;
    }
}
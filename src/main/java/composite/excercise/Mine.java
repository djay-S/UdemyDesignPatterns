package composite.excercise;

import java.util.*;

/*
* Consider the code presented below. The MyList.sum()  method adds up all the values in a list of ValueContainer
*   elements it gets passed. We can have a single value or a set of values.
* Complete the implementation of the interfaces so that sum()  begins to work correctly.
 * */
interface ValueContainer extends Iterable<Integer> {}

class SingleValue implements ValueContainer
{
    public int value;

    // please leave this constructor as-is
    public SingleValue(int value)
    {
        this.value = value;
    }

    public Iterator<Integer> iterator()
    {
        return Collections.singleton(value).iterator();
    }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer
{
}


class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c)
    {
        super(c);
    }

    public int sum()
    {
        // todo
        int s = 0;
        for(ValueContainer v : this) {
            for (int i : v)
                s += i;
        }
        return s;
    }
}
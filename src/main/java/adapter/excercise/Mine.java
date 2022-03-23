package adapter.excercise;

/*
* You are given a Rectangle  interface and an extension method on it.
* Try to define a SquareToRectangleAdapter  that adapts the Square  to the IRectangle  interface.
* */
class Square
{
    public int side;

    public Square(int side)
    {
        this.side = side;
    }
}

interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter implements Rectangle
{
    public int h, w;

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }
    public SquareToRectangleAdapter(Square square)
    {
        // todo
        h = square.side;
        w = square.side;
    }
}
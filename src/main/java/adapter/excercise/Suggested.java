package adapter.excercise;

class Square2
{
    public int side;

    public Square2(int side)
    {
        this.side = side;
    }
}

interface Rectangle2
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter2 implements Rectangle2
{
    private Square2 square;

    public SquareToRectangleAdapter2(Square2 square)
    {
        this.square = square;
    }

    @Override
    public int getWidth()
    {
        return square.side;
    }

    @Override
    public int getHeight()
    {
        return square.side;
    }
}
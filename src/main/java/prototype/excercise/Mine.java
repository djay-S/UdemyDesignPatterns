package prototype.excercise;

/*
* Given the following class definitions, you are asked to implement LineCopy() to perform a deep copy of the current Line object.
 * */
class Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Line
{
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        // todo
        return new Line(new Point(this.start.x, this.start.y), new Point(this.end.x, this.end.y));
    }
}

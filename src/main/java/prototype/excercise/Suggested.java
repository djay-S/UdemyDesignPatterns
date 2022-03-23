package prototype.excercise;

class Point2
{
    public int x, y;

    public Point2(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Line2
{
    public Point2 start, end;

    public Line2(Point2 start, Point2 end)
    {
        this.start = start;
        this.end = end;
    }

    public Line2 deepCopy()
    {
        Point2 newStart = new Point2(start.x, start.y);
        Point2 newEnd = new Point2(end.x, end.y);
        return new Line2(newStart, newEnd);
    }
}



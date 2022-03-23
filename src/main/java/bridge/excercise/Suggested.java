package bridge.excercise;


//abstract class Shape
//{
//  public abstract String getName();
//}
//
//class Triangle extends Shape
//{
//  @Override
//  public String getName()
//  {
//    return "Triangle";
//  }
//}
//
//class Square extends Shape
//{
//  @Override
//  public String getName()
//  {
//    return "Square";
//  }
//}
//
//class VectorSquare extends Square
//{
//  @Override
//  public String toString()
//  {
//    return String.format("Drawing %s as lines", getName());
//  }
//}
//
//class RasterSquare extends Square
//{
//  @Override
//  public String toString()
//  {
//    return String.format("Drawing %s as pixels", getName());
//  }
//}

// imagine VectorTriangle and RasterTriangle are here too

interface Renderer
{
    public String whatToRenderAs();
}

abstract class Shape2
{
    private Renderer renderer;
    public String name;

    public Shape2(Renderer renderer)
    {
        this.renderer = renderer;
    }

    @Override
    public String toString()
    {
        return String.format("Drawing %s as %s",
                name, renderer.whatToRenderAs());
    }
}

class Triangle2 extends Shape2
{
    public Triangle2(Renderer renderer)
    {
        super(renderer);
        name = "Triangle";
    }
}

class Square2 extends Shape2
{
    public Square2(Renderer renderer)
    {
        super(renderer);
        name = "Square";
    }
}

class RasterRenderer implements Renderer
{

    @Override
    public String whatToRenderAs()
    {
        return "pixels";
    }
}

class VectorRenderer2 implements Renderer
{
    @Override
    public String whatToRenderAs()
    {
        return "lines";
    }
}
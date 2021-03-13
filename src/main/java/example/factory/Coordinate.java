package example.factory;

public class Coordinate
{
    private final double xCoordinate;
    private final double yCoordinate;

    private final static Coordinate coordinateZero = new Coordinate(0,0);

    private Coordinate(double x, double y)
    {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public static final Coordinate fromXY(double x, double y)
    {
        if(x == 0 && y == 0) return coordinateZero;
        return new Coordinate(x, y);
    }

    public static final Coordinate fromPolar(double distance, double angle)
    {
        if(distance == 0 && angle == 0) return coordinateZero;
        return new Coordinate(distance * Math.cos(angle), distance* Math.sin(angle));
    }

    @Override
    public String toString()
    {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}

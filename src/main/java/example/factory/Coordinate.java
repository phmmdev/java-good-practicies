package example.factory;

public class Coordinate
{
    private final double xCoordinate;
    private final double yCoordinate;

    private Coordinate(double x, double y)
    {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public static final Coordinate fromXY(double x, double y)
    {
        return new Coordinate(x, y);
    }

    public static final Coordinate fromPolar(double distance, double angle)
    {
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

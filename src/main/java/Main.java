import example.factory.Coordinate;

public class Main
{
    public static void main(String[] args)
    {
        Coordinate coordinateFromXY =  Coordinate.fromXY(0,2);
        Coordinate coordinateFromPolar = Coordinate.fromPolar(100, 30);

        System.out.println(coordinateFromXY.toString());

        System.out.println(coordinateFromPolar.toString());
    }
}

import example.factory.Coordinate;

public class Main
{
    public static void main(String[] args)
    {
        Coordinate coordinateFromXY =  Coordinate.fromXY(0,2);
        Coordinate coordinateFromPolar = Coordinate.fromPolar(100, 30);

        Coordinate coordinateFromXYZero =  Coordinate.fromXY(0,0);
        Coordinate coordinateFromPolarZero = Coordinate.fromPolar(0, 0);


        System.out.println("Static Factory XY : " + coordinateFromXY.toString() + " " +coordinateFromXY.hashCode());
        System.out.println("Static Factory Polar : " + coordinateFromPolar.toString() + " " +coordinateFromPolar.hashCode());

        System.out.println("Static Factory XY returning 0,0 coordinate : " + coordinateFromXYZero.toString() + " " +coordinateFromXYZero.hashCode());
        System.out.println("Static Factory Polar returning 0,0 coordinate : " + coordinateFromPolarZero.toString() + " " +coordinateFromXYZero.hashCode());
    }
}

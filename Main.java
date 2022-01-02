import models.Shape.Square;
import models.Shape.SquareFactory;

/**
 * Exercise
 * 1. Implement the area formula for the Square class.
 * 2. Create a new subclass called Circle.
 * 3. Create 25 squares with random widths and heights dynamically using the SquareFactory class to generate the random square. Print the widths, heights, and areas to console.
 */
public class Main {
    public static void main(String[] args) {
        SquareFactory factory = new SquareFactory();

        System.out.println(factory);
        Square square = new Square(25,25);
        System.out.println(square.getHeight());
    }
   
}
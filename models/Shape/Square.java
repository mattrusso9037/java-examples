package models.Shape;

//Square class that extends AbstractShape to return the height, width, and area of a square.

public class Square extends AbstractShape {
    public Square(double height, double width) {

        super(height, width);

    }

    /**
     * Return the area using the area of a square formula
     */
    public double getArea(){

        Double area = Math.pow(this.getHeight(), 2);

        return area;
    }
}
 
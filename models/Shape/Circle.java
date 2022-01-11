package models.Shape;

public class Circle extends AbstractShape {
    public Circle(double height, double width) {
        super(height, width);
    }

    public double getArea(){
        Double area = Math.pow(this.getHeight(), 2);
        return area;
    }

}

package models.Shape;
/** radius function
 * have radius property
 * 
 */

public class Circle extends AbstractShape {
    public double height;
    public double width;
    public double radius;

    public Circle(double height, double width) {
        super(height, width);
    }
  
public void CircleRadius(double height, double width, double radius) {
    this.height = height;
    this.width = width;
    this.radius = radius;
        
}
    public double getArea(){
        Double area = (Math.PI * Math.pow(this.radius, 2));
        return area;
    }

  
}

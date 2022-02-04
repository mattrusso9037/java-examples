    package models.Shape;
/** Circle class that extends AbstractShape and implements a radius to implements a getArea Method
 * 
 * 
 */
    public class Circle extends AbstractShape {

        double height;
        double width;
        double radius;

    public Circle(double height, double width){

        super(height, width);

    }
  
    public Circle(double height, double width, double radius){

        super(height, width);
        this.radius = radius;
        
}
    public double getArea(){

        Double area = (Math.PI * Math.pow(this.radius, 2));
        return area;

    }

  
}

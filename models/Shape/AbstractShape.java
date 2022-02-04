package models.Shape;

/**
 * This class cannot be instantiated and will only be used to create specific shape classes that will extend it.
 * 
 */
abstract class AbstractShape {
    
        double height;
        double width;

    public AbstractShape(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }

    // This method is abstract, meaning we need to define it's behavior in all subclasses.
    public abstract double getArea();
}

package models.Shape;

final public class SquareFactory {
    public double height;
    public double width;
    public double area ;

    public SquareFactory() {
    
     for(int i = 0; i < 25; i++) {
         height =  Math.random() * 50;
         width =  Math.random() * 50;
        area = Math.pow(height,2);
        
        System.out.println("\nHeight: "); 
        System.out.format("%.2f", height);
        System.out.println("\nWidth: " );
        System.out.format("%.2f", width);
        System.out.println("\nArea: ");
        System.out.format("%.2f", area);
        System.out.println("\n");
    }

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

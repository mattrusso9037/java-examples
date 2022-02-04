package models.Shape;

//SquareFactory class that outputs to the user 25 random heights, widths, and area for a square
final public class SquareFactory{
    double height;
    double width;
    double area;

    public SquareFactory() {
    
     for(int i = 0; i < 25; i++){

        height =  Math.random() * 100;
        width =  Math.random() * 100;
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

    
}

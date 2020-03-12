
/**
 *
 * @author ricardopluviose
 */
public class RectangleTester 
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);    
        // Move the rectangle
        box.CalculateTranslate(15, 25);
        // Print information about the moved rectangle 
        System.out.print("x: "); 
        System.out.println(box.getX());
        System.out.println("Expected: 20"); 
        
        System.out.print("y: "); 
        System.out.println(box.getY());
        System.out.println("Expected: 35");  
        
        
        // Display the length.
        System.out.println("The box's height is " + box.getHeight());
        
        // Display the width.
        System.out.println("The box's width is " + box.getWidth());
        
        // Display the area.
        System.out.println("The box's area is " + box.CalculateArea());
        
        //Display the perimeter
        System.out.println("The box's perimeter is " + box.CalculatePerimeter());
    }
}     


/**
 *
 * @author ricardopluviose
 */
public class Rectangle {
     /* Writing the Code for the Class data Field */
    private int height;
    private int width;
    private int x;
    private int y;
    
    //Construtor
    public Rectangle()
    {
        
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /**
     *
     * @param height
     * @param width
     */
    public Rectangle(int width, int height)
    {
       this.width = width;
       this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Action Method      
    public double CalculateArea() 
    {
       double area;
       area = this.width * this.height;
       return area;
    }
    
    public void CalculateTranslate(int x, int y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    public double CalculatePerimeter()
    {
        double perimeter;
        perimeter = (2 * width) + (2 * height);
        return perimeter;
    }
}


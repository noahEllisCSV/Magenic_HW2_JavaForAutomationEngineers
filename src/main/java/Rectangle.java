/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [x] Update both the set method for rectangle like you did for square
 *      [x] Write the setters for the Rectangle Class
 *      [x] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    public void setLength(double length){
        if (length > 0)
        {
            this.length = length;
        }
        else
        {
            System.out.println("Side length must be greater than 0");
        }
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        if (width > 0)
        {
            this.width = width;
        }
        else
        {
            System.out.println("Side length must be greater than 0");
        }
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return (2 * width) + (2 * length);
    }

    // TODO FOR HOMEWORK: Write the method for area

    // TODO FOR HOMEWORK: Write the method for perimeter

    // TODO FOR HOMEWORK: Write a main method

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        double width = 4;
        double length = 6;

        rectangle.setWidth(width);
        rectangle.setLength(length);

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("A rectangle with side length of " + rectangle.getLength() + " and a width of " + rectangle.getWidth() + "has an area of: " + area);
        System.out.println("A rectangle with side length of " + rectangle.getLength() + " and a width of " + rectangle.getWidth() + "has a perimeter of: " + perimeter);
    }
}
import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {
    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }
    private double base;
    public double getBase() {
        return base;
    }

    public double userInputGetSide(){
        System.out.println("Please enter a double for the side length of your square:");
        Scanner scanner = new Scanner(System.in);
        double side;
        try{
            side = Double.parseDouble(scanner.nextLine());
        }
        catch(Exception e){
            System.out.println("please enter a double");
            return userInputGetSide();
        }
        if (side < 0){
            System.out.println("Side length must be a double greater than zero, please try again");
            return  userInputGetSide();
        }
        else{
            return  side;
        }
    }
    /**
     * Sets the Side Length
     * @param side The Side Length of a square
     */
    public void setBase(double side)
    {
        if (side > 0)
        {
            this.base = side;
        }
        else
        {
            System.out.println("Side length must be greater than 0");
        }
    }

    /**
     * Calculates the area of the square object
     * @return The area of the square
     */
    public double area() {
        double height = Math.sqrt(3) * base / 2;
        return (base * height) /2;
    }

    /**
     * Calculates the perimeter of the square object
     * @return The perimeter of the square
     */
    public double perimeter() {
        return 3 * base;
    }

    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle();

        double sideLength = triangle.userInputGetSide();

        triangle.setBase(sideLength);

        double area = triangle.area();
        double perimeter = triangle.perimeter();

        System.out.println("A triangle with side length of " + triangle.getBase() + " has an area of: " + area);
        System.out.println("A triangle with side length of " + triangle.getBase() + " has a perimeter of: " + perimeter);
    }

}
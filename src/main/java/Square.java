import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Square.java
 *      [ ] Correct the setSide method
 *      [ ] Fix25
 *
 */
public class Square {

    /**
     * The side length
     */
    private double side;

    /**
     * Creates an instance of the Square class
     */
    public Square() {
    }

    /**
     * Gets the Side Length
     * @return The Side Length
     */
    public double getSide() {
        return side;
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
    public void setSide(double side)
    {
        if (side > 0)
        {
            this.side = side;
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
        return side * side;
    }

    /**
     * Calculates the perimeter of the square object
     * @return The perimeter of the square
     */
    public double perimeter() {
        return 4 * side;
    }

    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Square square = new Square();

        double sideLength = square.userInputGetSide();

        square.setSide(sideLength);

        double area = square.area();
        double perimeter = square.perimeter();

        System.out.println("A square with side length of " + square.getSide() + " has an area of: " + area);
        System.out.println("A square with side length of " + square.getSide() + " has a perimeter of: " + perimeter);
    }
}

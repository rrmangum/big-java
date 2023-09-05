import java.awt.Rectangle;

public class Explore {
    public static void main(String[] args) {
        String string1 = "First String";
        String string2 = "Second String";
        String string3 = "Third String";

        System.out.println("This belongs to the PrintStream class");

        System.out.println(string1.length());
        System.out.println(string2.isEmpty());

        // PrintStream.close()

        double price = 119.99;
        String desc = "This item is an original pokemon card";

        // LocalDate newDate = LocalDate.of(1, 5, 1987);
        // string2.indexOf("S");

        String message = "Hello";

        System.out.println(message.toUpperCase());
        System.out.println(message.replace("H", "h"));

        String replaced = "Hello, World!";

        String output = replaced.replace(",", "").replace(" ", "").replace("!", "");

        System.out.println(output);

        // object
        Rectangle rect = new Rectangle();
        // object variable
        Rectangle rect2;

        Rectangle centerRect = new Rectangle(100, 100, 50, 50);
        System.out.println(centerRect);

        String dave = "Hello, Dave";

        Rectangle rectVar;

        rectVar = new Rectangle();

        String greeting;

        greeting = "Hello, Hilo";

        Rectangle square = new Rectangle(10, 20, 40, 40);
        square = new Rectangle(20, 20, 40, 40);

        Rectangle square1 = new Rectangle(20, 20, 40, 40);
        Rectangle square2 = square1;

        // Class
        // String
        // String
        // Rectangle
        // Random

        // Return Type
        // String
        // String
        // String
        // float

        // Method Name
        // String.concat()
        // String.trim()
        // Rectangle.toString()
        // Random.nextFloat()

        // Types of Arguments
        // String
        // None
        // None
        // None

        

    }
}
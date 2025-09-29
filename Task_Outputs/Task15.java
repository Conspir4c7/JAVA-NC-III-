package Task_Outputs;
interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    
    protected String color;
    protected double length;
    protected double width;
    
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    
    @Override
    public abstract double calculateArea();
    
    @Override
    public abstract double calculatePerimeter();

    public abstract void displayInfo();
}

class Circle extends AbstractShape {
    
    private double radius;
    
    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Circle Information ---");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter (Circumference): %.2f%n", calculatePerimeter());
    }
}

class Rectangle extends AbstractShape {
    
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Rectangle Information ---");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
    }
}

public class Task15 {

    public static void main(String[] args) {
        System.out.println("--- Shape Hierarchy Demonstration ---");
        
        Circle myCircle = new Circle("Red", 7.5);
        Rectangle myRectangle = new Rectangle("Blue", 12.0, 5.0);
        
        System.out.println("\n-----------------------------------\n");

        myCircle.displayInfo();
        
        System.out.println("\n-----------------------------------\n");
        
        myRectangle.displayInfo();
        
        Shape genericCircle = myCircle;
        Shape genericRectangle = myRectangle;

        System.out.println("\n-----------------------------------");
        System.out.println("Polymorphism Check (Using Shape Interface):");
        System.out.printf("Generic Circle Area: %.2f%n", genericCircle.calculateArea());
        System.out.printf("Generic Rectangle Perimeter: %.2f%n", genericRectangle.calculatePerimeter());
    }
}

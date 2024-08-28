class Pen {
    private String color;
    private double price;
    
    // Constructor to initialize Pen object
    public Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }
    
    // Getter for color
    public String getColor() {
        return color;
    }
    
    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Getter for price
    public double getPrice() {
        return price;
    }
    
    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Method to simulate writing
    public void write() {
        System.out.println("This is a pen writing in " + color + " color. Price: $" + price);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        // Creating a Pen object with color and price
        Pen p1 = new Pen("blue", 10.0);
        
        // Outputting the pen details
        p1.write();
    }
}

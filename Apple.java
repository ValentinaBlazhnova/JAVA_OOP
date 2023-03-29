public class Apple extends Product {

    private String colour;
    public Apple(String name, double price, int value, String colour) {
        super(name, price, value);
        this.colour = colour;
    }
    
    @Override
    public String toString() {
        return String.format( "Apple, %s, %s", colour, super.toString());
    }
}

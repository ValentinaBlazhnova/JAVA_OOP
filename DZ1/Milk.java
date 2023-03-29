public class Milk extends Product{

    public Milk(String name, double price, int value) { //конструктор
        super(name, price, value);
    }

    @Override
    public String toString() {
        return String.format("Milk : %s" ,super.toString());
    }
}

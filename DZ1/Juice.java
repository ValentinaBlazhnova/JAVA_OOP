public class Juice extends Product {

    public Juice(String name, double price, int value) { // вызвали конструктор
        super(name, price, value);
    }

    @Override
    public String toString() {
        return String.format("Juice : %s", super.toString());
    }
}

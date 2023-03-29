public class Chocolate extends Product{

    private String taste; // расширение продукта, добавление нового типа taste
    public Chocolate(String name, double price, int value, String taste) { //вызов конструктора
        super(name, price, value); //родительский конструктор
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Chocolate so vkusom %s, %s", taste, super.toString());
    }
}

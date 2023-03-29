public class Product {
    private String name;
    private double price;
    private int counter; // счётчик сколько осталось

    public Product(String name, double price, int value) { // Конструктор для имени и цены
        this.name = name;
        this.price = price;
        counter=value;
    }

    public String getName() { // Конструктор Getters для Name
        return name;
    }

    private void setName(String name) { // Конструктор Setter Поменяли на private - значит, что не будет доступа для изменения имени
        this.name = name;
    }

    public boolean sellCounter() { // Конструктор (изменённый) сколько осталось штук в автомате
        this.counter--;
        return counter>0;
    }

    public double getPrice() { // Конструктор Getters для Price
        return price;
    }

    public void setPrice(double price) { //Конструктор Setter для Price
        this.price = price*2;
    }

    @Override //Форматируем, чтобы строка возвращала  имя и цену
    public String toString() {
        return String.format("%s : %.2f rub.", name, price);
    }
}

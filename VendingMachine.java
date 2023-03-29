import java.util.ArrayList;
import java.util.List;


public class VendingMachine {
    private List<Product> products = new ArrayList<>(); // Создали список продуктов
    private double money = 0; // Для продажи товара

    public VendingMachine addProduct(Product product) { // Добавление продуктов
        products.add(product);
        return this; // Ссылка на class VendingMachine
    }

    public Product searchProduct(String name) { //Поиск продукта по имени
        for (Product item : products) {
            if (item.getName().equals(name)) { //equals - сравнивает свойства объектов, в отличие от ==(сравниет ссылки)
                return item;
            }
        }
        return null;
    }

    public Product sell(String name) throws Exception { // Продажа продукта по имени
        Product target = searchProduct(name);
        try {                               //Проверка для несуществующего товара, иначе будет ошибка, если ввести товар, которого нет
            if (!target.sellCounter()){ // Если товар закончился
                products.remove(target); // То удаляем его из списка

            }
            this.money += target.getPrice();
        } catch (NullPointerException e) {
//            System.out.println("Товар не найден");
            throw new Exception("Tovar ne naiden", e); // Для того, чтобы не печаталось null
        }

        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();//StringBuilder - изменяемая строка в отличие от String
        for (Product item : products) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("V avtomate seichas %.2f rub.", money)); //%.2f - 2 знака после запятой \ состояние автомата
        return res.toString();
    }
}

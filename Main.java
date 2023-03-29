public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine(); //Добавление продуктов в VendingMachine
        mart.addProduct(new Product("bread", 35, 10))
                .addProduct(new Milk("moloko", 50, 2))
                .addProduct(new Product("cheese", 100.2, 5))
                .addProduct(new ConcentrateMilk("Sovetskaya", 150, 1))
                .addProduct(new Chocolate("Alenka", 35.20,3, "Orehoviy"))
                .addProduct(new Juice("Dobriy", 80, 4))
                .addProduct(new Apple("Golden", 30, 5, "green"));

        System.out.println("Do prodazhi");
        System.out.println(mart); //Показывает сколько денег в автомате
        PrintSell(mart,"moloko"); //продажа молока 
        PrintSell(mart,"moloko");
        PrintSell(mart,"Dobriy");
        System.out.println();
        System.out.println("Posle prodazhi");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Paket");// Продажа несуществующего товара
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){ //печать продаж
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Product not found"); //Товар не найден
        }
    }
}
public class ConcentrateMilk extends Milk {

    public ConcentrateMilk(String name, double price, int value) { // конструктор
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Sgyshenka: ")
                .append(super.toString());
        return res.toString();
    }
}

package exam03;

public class Box<T extends Fruit & Eatable> { // Apple, Fruit
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void printInfo() {
        String itemNM = item.get(); // Fruit apple = new Apple()
        System.out.println(itemNM);
    }
}

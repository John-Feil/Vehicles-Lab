package morevehicles;

public class Horse extends Vehicle implements IRideable{
    public Horse(String name, int qty, double price){
        this.setName(name);
        this.setQty(qty);
        this.setPrice(price);
    }
    @Override
    public void printExperience() {
        System.out.println("Slow and bumpy");
    }

    @Override
    public void calcTotal() {
        System.out.println(getPrice() * getQty());
    }
}

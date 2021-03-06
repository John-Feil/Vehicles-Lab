package morevehicles;

public class Car extends Vehicle implements ITowable{
    public Car(String name, int qty, double price){
        this.setName(name);
        this.setQty(qty);
        this.setPrice(price);
    }
    @Override
    public void calcTotal() {
        System.out.println(getPrice() * getQty());
    }

    @Override
    public boolean canBeTowed() {
        return true;
    }
}

package morevehicles;

public class MotorBike extends Vehicle implements IRideable,ITowable{
    public MotorBike(String name, int qty, double price){
        this.setName(name);
        this.setQty(qty);
        this.setPrice(price);
    }
    @Override
    public void printExperience() {
        System.out.println("Fast and smooth");
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

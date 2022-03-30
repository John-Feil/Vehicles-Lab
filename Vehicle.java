package morevehicles;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;
    public abstract void calcTotal();

    public static void printVehicleName(Vehicle n){
            System.out.println(n.getName());
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

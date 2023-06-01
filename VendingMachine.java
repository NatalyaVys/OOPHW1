package OOPHW1;

public interface VendingMachine {
    void addDrink(hotDrink drink);

    public drink getProduct(String type, int volume, int temperature);
    
}

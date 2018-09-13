package tech.bts.productcatalog;

public class Product {

    String name;
    double price;
    int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;


    }

    public String toString() {
        return this.name + " - " + this.price + " euros "
                + this.quantity + " units";
    }
}

package org.skypro.skyshop.model.product;



import java.util.UUID;

public class SimpleProduct extends Product {

    private final int price;


    public SimpleProduct(UUID id, String name, int price) {
        super(id,name);
        if (price < 1) throw new IllegalArgumentException("Price must be positive");
        this.price = price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s : %d", super.toString(), price);
    }

}



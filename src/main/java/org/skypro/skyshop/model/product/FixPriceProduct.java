package org.skypro.skyshop.model.product;


import java.util.UUID;

public class FixPriceProduct extends Product {

    private static final int FIX_PRICE = 50;

    public FixPriceProduct(UUID id, String name) {
        super(id, name);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }


    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return String.format("%s : Фиксированная цена %d", super.toString(), FIX_PRICE);
    }

}

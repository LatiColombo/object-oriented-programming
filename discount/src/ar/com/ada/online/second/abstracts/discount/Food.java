package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Food extends Product {

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.dayOfWeek.equals("tuesday") || ShoppingCart.dayOfWeek.equals("thursday")) {
            discount = listPrice * 0.10;
        } else
            discount = 0d;
    }
}

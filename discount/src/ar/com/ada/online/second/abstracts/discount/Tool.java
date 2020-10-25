package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Tool extends Product{


    @Override
    public void calculateDiscount() {
        if (ShoppingCart.paymentMethod.equals("tdc"))
        discount = listPrice * 0.05;
    else
        discount = 0d;
    }


}

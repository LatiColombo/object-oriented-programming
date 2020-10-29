package ar.com.ada.online.second.abstracts.discount;

public class Toy extends Product {

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.amountOfToys >= 3 || ShoppingCart.partialPriceToys <= 3000)
            discount = listPrice * 0.25;
        else
            discount = 0d;
    }
}

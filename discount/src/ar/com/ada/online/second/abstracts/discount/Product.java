package ar.com.ada.online.second.abstracts.discount;

public abstract class Product {

    protected Double listPrice;
    protected Double discount;

    public Product () {
    }

    public abstract Double calculateDiscount();

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}

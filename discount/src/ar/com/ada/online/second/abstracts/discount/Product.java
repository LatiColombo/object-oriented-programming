package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public abstract class Product {

    protected Double listPrice;
    protected Double discount;
    protected String name;

    public Product() {
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculateDiscount();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return listPrice.equals(that.listPrice) &&
                discount.equals(that.discount) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listPrice, discount, name);
    }

}

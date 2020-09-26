package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Toy extends Product{

    private String toyName;
    private Double toyPrice;
    private Integer toyQuantity;

    public Toy (){
    }

    @Override
    public Double calculateDiscount() {
        return toyPrice * 0.25;
    }

    public Toy(String toyName, Double toyPrice) {
        this.toyName = toyName;
        this.toyPrice = toyPrice;
        this.toyQuantity = toyQuantity;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(Double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public Integer getToyQuantity() {
        return toyQuantity;
    }

    public void setToyQuantity(Integer toyQuantity) {
        this.toyQuantity = toyQuantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toy that = (Toy) obj;
        return toyName.equals(that.toyName) &&
                toyPrice.equals(that.toyPrice) &&
                toyQuantity.equals(that.toyQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyName, toyPrice, toyQuantity);
    }

    @Override
    public String toString() {
        return String.format(
                "Toy{ toyName = %f, toyPrice = %f, toyQantity = %f}",
                toyName,
                toyPrice,
                toyQuantity
        );
    }

}

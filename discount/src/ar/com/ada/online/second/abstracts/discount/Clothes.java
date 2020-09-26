package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Clothes extends Product {

    private String clothesType;
    private String clothesName;
    private Double clothesPrice;

    public Clothes () {
    }

    @Override
    public Double calculateDiscount() {
        return clothesPrice * 0.15;
    }

    public Clothes(String clothesType, String clothesName, Double clothesPrice) {
        this.clothesType = clothesType;
        this.clothesName = clothesName;
        this.clothesPrice = clothesPrice;
    }

    public String getClothesType() {
        return clothesType;
    }

    public void setClothesType(String clothesType) {
        this.clothesType = clothesType;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public Double getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(Double clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothes that = (Clothes) obj;
        return clothesType.equals(that.clothesType) &&
                clothesName.equals(that.clothesName) &&
                clothesPrice.equals(that.clothesPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothesType, clothesName, clothesPrice);
    }

    @Override
    public String toString() {
        return String.format(
                "Clothes{ clothesType = %f, clothesName = %f, clothesPrice = %f}",
                clothesType,
                clothesName,
                clothesPrice
        );
    }


}

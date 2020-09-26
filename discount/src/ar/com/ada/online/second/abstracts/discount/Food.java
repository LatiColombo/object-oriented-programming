package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Food extends Product {

    private Boolean discountDay;
    private Double foodPrice;
    private String foodName;

    public Food () {
    }

    @Override
    public Double calculateDiscount() {
        return foodPrice * 0.10;
    }

    public Food(String foodName, Double foodPrice) {
        this.foodPrice = foodPrice;
        this.foodName = foodName;
    }

    public Boolean getDiscountDay() {
        return discountDay;
    }

    public void setDiscountDay(Boolean discountDay) {
        this.discountDay = discountDay;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Food that = (Food) obj;
        return foodPrice.equals(that.foodPrice) &&
                foodName.equals(that.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodPrice, foodName);
    }

    @Override
    public String toString() {
        return String.format(
                "Food{ foodPrice = %f, foodName = %f }",
                foodPrice,
                foodName
        );
    }

}

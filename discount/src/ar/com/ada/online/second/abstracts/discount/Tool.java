package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Tool extends Product{

    private Double toolPrice;
    private String toolName;
    private Boolean creditCard;

    public Tool () {
    }

    @Override
    public Double calculateDiscount() {
        return toolPrice * 0.05;
    }

    public Tool(String toolName, Double toolPrice) {
        this.toolPrice = toolPrice;
        this.toolName = toolName;
    }

    public Double getToolPrice() {
        return toolPrice;
    }

    public void setToolPrice(Double toolPrice) {
        this.toolPrice = toolPrice;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public Boolean getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Boolean creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tool that = (Tool) obj;
        return toolPrice.equals(that.toolPrice) &&
                toolName.equals(that.toolName) &&
                creditCard.equals(that.creditCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolPrice, toolName, creditCard);
    }

    @Override
    public String toString() {
        return String.format(
                "Tool{ toolPrice = %f, toolName = %f, creditCard = %f}",
                toolPrice,
                toolName,
                creditCard
        );
    }

}

package ar.com.ada.online.second.abstracts.discount;

import java.util.Objects;

public class Clothes extends Product {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void calculateDiscount() {
        if (department.equals("kids") || department.equals("women"))
            discount = listPrice * 0.10;
        else
            discount = 0d;
    }
}
package ar.com.ada.online.second.abstracts.discount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ShoppingCart {

    public static String dayOfWeek;
    public static Integer amountOfToys = 0;
    public static Double partialPriceToys = 0d;
    public static String paymentMethod;
    private ArrayList<Product> products = new ArrayList<>(); //lo inicializo acá para no ponerlo en el constructor

    public ShoppingCart() {
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Date now = new Date(); //Instancio para que me tome el día actual
        ShoppingCart.dayOfWeek = formatter.format(now);
    }

    public ArrayList <Product> getProducts (){
        return products;
    }

    public void addProduct (Product product) {
        if (product instanceof Toy) {
            amountOfToys++; // incrementa en 1 el contador de juguetes
            partialPriceToys = partialPriceToys + product.getListPrice();  // suma de forma parcial el precio del toy
        }
        this.products.add(product);
    }

    public void generateAndPrintTicket(Scanner keyboard) {
        Double paymentWithoutDiscount = 0d;
        Double totalDiscount = 0d;
        Double totalPayment;

        System.out.println("Seleccione el medio de pago:\n\t1) Tarjeta de débito\n\t2) Tarjeta de crédito\n\t3) Efectivo");
        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                ShoppingCart.paymentMethod = "tdd";
                break;
            case 2:
                ShoppingCart.paymentMethod = "tdc";
                break;
            default:;
                ShoppingCart.paymentMethod = "cash";
                break;
        }

        System.out.println("\nNombre\t\tPrecio\t\tDescuento");

        for (Product product : this.products) {
            product.calculateDiscount();
            paymentWithoutDiscount = paymentWithoutDiscount + product.getListPrice();
            totalDiscount = totalDiscount + product.getDiscount();

            System.out.printf(
                    "%s\t\t%.2f\t\t%.2f\n",
                    product.getName(),
                    product.getListPrice(),
                    product.getDiscount()
            );
        }

        totalPayment = paymentWithoutDiscount - totalDiscount;

        System.out.printf("\nTotal sin descuento: $ %.2f\n", paymentWithoutDiscount);
        System.out.printf("Descuento: $ %.2f\n", totalDiscount);
        System.out.printf("Total a pagar: $ %.2f\n", totalPayment);
    }
}

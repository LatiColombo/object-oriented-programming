package ar.com.ada.online.second.abstracts.discount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner keyboard = new Scanner(System.in);

        menu(shoppingCart, keyboard);
        shoppingCart.generateAndPrintTicket(keyboard);  //Una vez que terminó de llenarse el carrito, imprime el ticket
    }

    static void menu(ShoppingCart shoppingCart, Scanner keyboard) {
        int continueMenu;
        do {
            System.out.println("Por favor elija una categoría: \n\t1) Alimentos\n\t2) Ropa\n\t3) Juguetes\n\t4) Herramientas: ");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = getFoodItem(keyboard);
                    if (food != null)
                        shoppingCart.addProduct(food);
                    break;
                case 2:
                    Clothes clothes = getClothesItem(keyboard);
                    if (clothes != null)
                        shoppingCart.addProduct(clothes);
                    break;
                case 3:
                    Toy toy = getToyItem(keyboard);
                    if (toy != null)
                        shoppingCart.addProduct(toy);
                    break;
                case 4:
                    Tool tool = getToolItem(keyboard);
                    if (tool != null)
                        shoppingCart.addProduct(tool);
                    break;
            }

            System.out.println("Desea agregar otro producto? \n\t1) Si\n\t2) No");
            continueMenu = keyboard.nextInt();

        } while (continueMenu == 1);
    }

    static Food getFoodItem(Scanner keyboard){
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Leche \t\t$50");
        System.out.println("\t2) Fideos\t\t$70");
        System.out.println("\t2) Garbanzos\t\t$47");
        System.out.println("\t2) Levadura\t\t$64");

        Food food = new Food(); // instancio el objeto Comida

        int option = keyboard.nextInt();

        switch (option) {  // al objeto comida le seteo el nombre y el precio
            case 1:
                food.setName("Leche");
                food.setListPrice(50d);
                break;
            case 2:
                food.setName("Fideos");
                food.setListPrice(70d);
                break;
            case 3:
                food.setName("Garbanzos");
                food.setListPrice(47d);
                break;
            case 4:
                food.setName("Levadura");
                food.setListPrice(64d);
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                food = null; // anulo esta instancia porque no eligió una opción válida
        }
        return food;
    }

    static Clothes getClothesItem(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Zapatos niño\t\t$2000");
        System.out.println("\t2) Vestido\t\t$3500");
        System.out.println("\t3) Camisa\t\t$1500");
        System.out.println("\t4) Sweater\t\t$1800");

        Clothes clothes = new Clothes();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                clothes.setName("Zapatos");
                clothes.setListPrice(2000d);
                clothes.setDepartment("kids");
                break;
            case 2:
                clothes.setName("Vestido");
                clothes.setListPrice(3500d);
                clothes.setDepartment("kids");
                break;
            case 3:
                clothes.setName("Camisa");
                clothes.setListPrice(1500d);
                clothes.setDepartment("kids");
                break;
            case 4:
                clothes.setName("sweater");
                clothes.setListPrice(2000d);
                clothes.setDepartment("kids");
                break;
        }
        return clothes;
    }

    static Toy getToyItem(Scanner keyboard){
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Rastis \t\t$5000");
        System.out.println("\t2) Mecano\t\t$4799");
        System.out.println("\t2) Encastre\t\t$477");
        System.out.println("\t2) Plastilina\t\t$644");

        Toy toy = new Toy();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                toy.setName("Rastis");
                toy.setListPrice(5000d);
                break;
            case 2:
                toy.setName("Mecano");
                toy.setListPrice(4799d);
                break;
            case 3:
                toy.setName("Encastre");
                toy.setListPrice(477d);
                break;
            case 4:
                toy.setName("Plastilina");
                toy.setListPrice(644d);
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                toy = null;
        }
        return toy;
    }

    static Tool getToolItem(Scanner keyboard){
        System.out.println("Seleccione un producto de la lista:");
        System.out.println("\t1) Martillo \t\t$240");
        System.out.println("\t2) Destornillador\t\t$654");
        System.out.println("\t2) Taladro\t\t$6776");
        System.out.println("\t2) Pinza\t\t$454");

        Tool tool = new Tool();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                tool.setName("Martillo");
                tool.setListPrice(240d);
                break;
            case 2:
                tool.setName("Destornillador");
                tool.setListPrice(654d);
                break;
            case 3:
                tool.setName("Taladro");
                tool.setListPrice(6776d);
                break;
            case 4:
                tool.setName("Pinza");
                tool.setListPrice(454d);
                break;
            default:
                System.out.println("Debe elegir una opción válida");
                tool = null;
        }
        return tool;
    }
}

package ar.com.ada.online.second.abstracts.discount;

public class Main {

    public static void main(String[] args) {

        Food arroz = new Food("arroz", 10.50);
        Food lentejas = new Food("lentejas", 20.50);
        Food azucar = new Food("azucar", 8.50);

        Clothes pollera = new Clothes("Mujer", "pollera", 300.70);
        Clothes pantalon1 = new Clothes("Mujer","pantalon1", 1000.70);
        Clothes camisa = new Clothes("Mujer","pollera", 500.70);

        Clothes zapatillas = new Clothes("Niño","zapatillas", 3000.70);
        Clothes pantalon2 = new Clothes("Niño","pantalon2", 700.70);
        Clothes remera = new Clothes("Niño","remera", 560.70);

        Tool martillo = new Tool("martillo", 400.40);
        Tool serrucho = new Tool("serrucho", 980.40);
        Tool taladro = new Tool("taladro", 7400.40);

        Toy cochecito = new Toy("cochecito", 1300.60);
        Toy rastis = new Toy("rastis", 1300.60);
        Toy barbie = new Toy("barbie", 80000.60);
    }
}

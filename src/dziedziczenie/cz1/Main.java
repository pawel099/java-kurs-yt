package dziedziczenie.cz1;

public class Main {

    public static void main(String[] args) {

        samochod audi = new samochod();

        audi.model=" Audi ";
        audi.color=" red ";
        audi.price=1562.09;
        audi.getCarInfo();

        System.out.println("..............................................");

        samochod bmw = new samochod();

        bmw.model=" Bmw ";
        bmw.color=" blue ";
        bmw.price=1112.09;
        bmw.getCarInfo();

        // dziedziczę po klasie samochód

        audi.ringBell(" bim bam dzwonek samochodowy");
        bicycle bc = new bicycle();
        bc.ringBell("brruuu dzwonek motoru ");

    }
}

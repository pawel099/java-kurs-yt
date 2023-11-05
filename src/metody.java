public class metody {

    private String name = "nazwa produktu";
    private double liczba ;

    public metody(String name , double liczba) {

        this.name = name;
        this.liczba = liczba;

    }
    public String getName() {

        return name;
    }

    public String setName(String name) {

        return this.name;
    }


    public double getLiczba() {

        return liczba;
    }

    public double setLiczba(double liczba) {

        return this.liczba;
    }

    public static void main(String[] args) {

        metody wynik1 = new metody("mleko",3);
        metody wynik2 = new metody("wedlina",12);


    }
}

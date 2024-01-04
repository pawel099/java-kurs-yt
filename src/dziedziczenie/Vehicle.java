package dziedziczenie;

public class Vehicle  {

    public String color;
    public String model ;

    public double price;


    public void getVehicleInfo() {

        System.out.println("Model " + model);
        System.out.println("color " + color);
        System.out.println("Cena " + price);
    }


    public void ringBell(String cars) {
        System.out.println(cars);
    }

}

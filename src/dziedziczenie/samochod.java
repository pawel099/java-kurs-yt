package dziedziczenie;

public class samochod extends Vehicle {

      int km =100;

    protected void getCarInfo() {

        getVehicleInfo();

        System.out.println("km " + km);
    }
}

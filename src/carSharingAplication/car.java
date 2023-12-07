package carSharingAplication;
public class car extends bicycle {
    public String color="green";
    public String model;
    public Double price;
    public Double km;
    private Integer TopSpeed=123;

    public void getInfoCar(String model,String color,Double price ,Double km) {

        System.out.println(this.model=model);
        System.out.println(this.color);
        System.out.println(String.format("%.3f",this.price=price));
        System.out.println(this.km=km);

    }

    public Integer getTopSpeed() {
        return this.TopSpeed;

    }

      public void setTopSpeed(Integer topSpeed) {
      this.TopSpeed = topSpeed;

    }

    public void setTopSpeed(int topSpeed) {
        this.TopSpeed=topSpeed;
    }

    public static void main(String[] args) {

        car bmw = new car();
        bmw.getInfoCar("BMW","RED",122.0,123.1) ;
        System.out.println("...............................................................");
        car audi = new car();

        audi.getInfoCar("Audi","red",234.8,66.9);
        audi.setTopSpeed(140);
        int dd = audi.getTopSpeed();
        System.out.println(" prędkość " + dd);

        car sharing = new car();
        sharing.motorówka();
        sharing.bicycle();

    }

}


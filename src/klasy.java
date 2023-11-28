public class klasy {
     String pole1="jakies pole";
     String pole2;
     Double pole3;
     Boolean pole4;

     public String getPole1() {
         return this.pole1 ;
     }

    public String setPole1() {
        return this.pole1;
    }

     public String getPole2() {
        return pole2;
    }

    public Double getPole3() {
        return pole3;

    }

    public Boolean getPole4() {
        return pole4;

    }

     public static void main(String[] args) {
         klasy obiekt = new klasy();

         System.out.println(obiekt.getPole1());

     }

}

package interfacePackageClass;


public class krowa implements Animal, Mammal {
    @Override
    public void talk() {
        System.out.println("krowa robi muuu ");
    }

    public String getType() {

        return "krowa";
    }

    public String legs()
    {
        return "szescionóg";

    }
    public int getNumberLegs() {
        return 6;
    }

    @Override
    public void sleep() {
        System.out.println("krowa sleeping!");

    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

}

package interfacePackageClass;

public class dog extends quadropets implements Animal ,Mammal {
    @Override
    public void talk() {
        System.out.println("piesek robi szczek szczek ");
    }

    public String getType() {

        return "dog";
    }

    @Override
    public String legs()
    {
        return "czworonóg";

    }
    public int getNumberLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("dog sleeping!");

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

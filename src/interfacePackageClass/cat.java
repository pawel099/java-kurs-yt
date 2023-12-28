package interfacePackageClass;

public class cat extends quadropets implements Animal ,Mammal {

    public String getType() {

        return "cat";
    }

    @Override
    public void talk() {
        System.out.println("cat robi Miauu");
    }

    @Override
    public String legs()
        {
            return "czworonóg";

        }


    public int getNumberLegs() {
        return 4 ;
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeping!");
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }

    @Override
    public int getNumberOfLegs() {
        return 0;
    }
}

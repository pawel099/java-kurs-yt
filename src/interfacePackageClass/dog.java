package interfacePackageClass;

public class dog extends quadropets implements Animal ,Mammal {

    public static final int LEGS_DOG=4;

    public static int dogCount;

    public static int dogCount() {

        return 5;
    }

    @Override
    public SizeType getSize() {
        return SizeType.MEDIUM;
    }

    dog() {
        dogCount++;
    }

    public static int getAllLegs() {

     return dogCount = LEGS_DOG;
    }



    @Override
    public void talk() {
        System.out.println("piesek robi szczek szczek ");
    }
    public String getType() {
        return "dog";
    }
    @Override
    public String legs() {
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

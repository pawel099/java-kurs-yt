package interfacePackageClass;

public class bird implements Animal {

    public String getType() {

        return "bird";
    }

    @Override
    public void talk() {
        System.out.println("ptaszek robi cwir cwir");
    }

    @Override
    public int getNumberLegs() {
        return 2;
    }
}

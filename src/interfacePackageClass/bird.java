package interfacePackageClass;

public class bird implements Animal {

    public static int getBirdCound() {

        return 1;
    }

    @Override
    public SizeType getSize() {
        return SizeType.SMALL;
    }

    public static int BirdCound;
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

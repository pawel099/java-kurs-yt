package interfacePackageClass;

public interface Animal {

    SizeType getSize();

    void talk() ;
    String getType();
    int getNumberLegs();

    default void sierść() {
        System.out.println("kotek w łatki");
    }
    default void sleep() {
    System.out.println("sleeping");
    }
    default void wakeUp() {
        System.out.println("WakeUp");
    }
}

package interfacePackageClass;

public interface Mammal {

    void talk();

    int getNumberOfLegs();

    default void sleep() {
        System.out.println("Mammmal sleeping");
    }

    default void wakeUp() {
        System.out.println(" Mammal WakeUp ");
    }

}

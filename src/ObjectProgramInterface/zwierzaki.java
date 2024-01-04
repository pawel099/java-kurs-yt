package ObjectProgramInterface;

public class zwierzaki implements animals {

    @Override
    public String dog() {
        return "piesek rasy spaniel";
    }
    @Override
    public String cat() {
        return null;
    }

    public String bird() {
        return null;

    }
}



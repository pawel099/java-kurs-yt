package ObjectProgramInterface;

public class zwierzaki2 implements animals {

    public String bird() {
        return "ptaszek ćwierka";
    }


    @Override
    public String cat() {
        return "kotek miauczy miauu";
    }
    @Override
    public String dog() {
        return "piesek rasy labrator ";
    }

    @Override
    public String getDog() {
        return "ten piesek jest brzydki ";
    }
}





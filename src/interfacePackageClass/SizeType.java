package interfacePackageClass;

public enum SizeType {

    SMALL("maly"),
    MEDIUM("sredni"),
    BIG("duzy");

    private String translation;


    SizeType(String translation) {

        this.translation=translation;

    }

    public String getTranslation() {

        return translation;
    }




}

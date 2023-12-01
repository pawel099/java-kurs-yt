package carSharingAplication;

public class bicycle {

    String name ;
    String color ;
    String etykieta =" cena ";
    Double price =123.0;

    protected void bicycle() {

        System.out.println(this.name="rower");
        System.out.println(this.color="kolor czerwony");
        Double pric = this.price = 34555.0;
        System.out.println(this.etykieta + " " + pric);

    }

    protected void motorówka() {

        System.out.println(this.name="motorówka");
        Double pric = this.price = 123.0;
        System.out.println(this.color="kolor niebieski");
        System.out.println(this.etykieta + " " +  pric);

    }


}

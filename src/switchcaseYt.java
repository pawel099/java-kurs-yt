import java.util.Scanner;

public class switchcaseYt {
public static void main(String[] args) {

    String newline = System.lineSeparator();
    System.out.println("WZORY MATEMATYCZNE:");
    System.out.println("Wybierz wzór:" + newline + "1) obwód kwadratu" + newline + "2) obwód prostakąta" );
    Scanner sca = new Scanner(System.in);
    int option = sca.nextInt();

    switch (option) {

        case 1: {
            System.out.println("podaj długość boku kwadratu aby obliczyć jego obwód:");
            int widthlength = sca.nextInt();
            System.out.println("obwód kwadratu to: " + (4 * widthlength));
            break;

        }

        case 2: {
            System.out.println("podaj długość boku A prostokąta:");
            int widthlengthA = sca.nextInt();
            System.out.println("podaj długość boku B prostokąta:");
            int widthlengthB = sca.nextInt();
            System.out.println("Obwód prostokąta to " + (widthlengthA * widthlengthB) );
            break;
        }

        default: {
            System.out.println("nie ma takiej opcji");

        }
      }


}
}

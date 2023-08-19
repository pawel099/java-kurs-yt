import java.util.Scanner;

/* proste ćwiczenie  instrukcja warunkowa switch case */

public class Main {
    public static void main(String[] args) {

        Scanner obiejcts = new Scanner(System.in);

        String dane  = obiejcts.nextLine();

           switch (dane) {

               case "pawel":
                   System.out.println("Hello pawel");
                   break;

               case "anna":

                   System.out.println("Hello anna");
                   break;

               case "piotr":

                   System.out.println("Hello piotr");
                   break;

               case "michal":

                   System.out.println("Hello michal");
                   break;

               default:
                   System.out.println("witaj nieznajomy");




           }
    }
}
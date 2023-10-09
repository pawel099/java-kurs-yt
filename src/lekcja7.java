import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lekcja7 {

    private Scanner scanner ;

    protected int instrukcjeWarunkowe(int wyniki) {

              if (wyniki == 1) {

                scanner = new Scanner(System.in);

                System.out.print("oblicz d\u0142ugo\u015B\u0107 boku kwadratu aby wyliczy\u0107 jego obwód \u015B\u0107: ");
                int x = scanner.nextInt();
                int suma = (4 * x);

                return suma;

            } else if (wyniki == 2) {

                scanner = new Scanner(System.in);

                System.out.print("podaj długość boku A prostokąta: ");

                int x = scanner.nextInt();
                System.out.print("podaj długość boku B prostokąta: ");

                int y = scanner.nextInt();
                int suma = 2 * x + 2 * y;
                return suma;
            }

            return 0;
    }
    private int switchCase(int f) {

        switch(f) {

                    case 1:
                    scanner = new Scanner(System.in);

                    System.out.print("oblicz d\u0142ugo\u015B\u0107 boku kwadratu aby wyliczy\u0107 jego obwód\u015B\u0107: ");
                    int c = scanner.nextInt();
                    int suma = (4 * c);
                    return suma;
                    case 2:

                    scanner = new Scanner(System.in);
                    System.out.print("podaj długość boku A prostokąta: ");
                    int x = scanner.nextInt();

                    System.out.print("podaj długość boku B prostokąta: ");

                    int y = scanner.nextInt();
                        System.out.print("pole prostokąta: to " + (2 * x + 2 * y));
                    suma = 2 * x + 2 * y;

                    return suma;

            }

          return 0;
    }

        public static void main(String[] args)  {

        Scanner initialize  = new Scanner(System.in);
        int y = initialize.nextInt();
        lekcja7 wynik = new lekcja7();


    System.out.println(wynik.switchCase(y));


}

}

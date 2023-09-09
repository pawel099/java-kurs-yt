
import java.util.Scanner;
/* zadanie do wykonania
 wypisz liczby podzielne przez 2 w konsoli i rozwiązanie

 */

public class lekcja1 {
    protected String wynik ;
    private String lekcja1() {

        try {

             System.out.println("wpisz liczbę  ");
             Scanner scanner = new Scanner(System.in);

              int dane = scanner.nextInt();
                  if (dane % 2 == 0 && dane != 0) {
                      this.wynik =  "liczba jest podzielna przez dwa";

            } else {
                      this.wynik = " liczba niepodzielna ";}
             }

             catch (java.util.InputMismatchException exception) {
             this.wynik = "to nie jest liczba!" ;

            }
               return this.wynik;
            }

               public static void main(String[] args)  {
               lekcja1 c = new lekcja1();
               System.out.println(c.lekcja1());
    }
}





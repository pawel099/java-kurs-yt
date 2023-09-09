
import java.util.Scanner;

public class lekcja2 {
    /* zadanie wyswietl liczby podzielne przez 2 i rozwiązanie */

    public static void main(String[] args) {

         int index = 0;
         while (index<10) {

             if (index % 2 == 0 && index != 0) {
                System.out.println(index);
             }

            index++;
        }
    }
}




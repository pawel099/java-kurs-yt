package simpleGames;

import java.util.Random;
import java.util.Scanner;
public class aplikacja {
    int index ;
    public int wyniki(Scanner scanner) {

        int wynik = scanner.nextInt();
        Random rmd = new Random();
            int dane = rmd.nextInt(10);
                    if (dane!=0 && wynik==dane) {
            String x = "brawo ";
            System.out.print(x);
        }
        else {
            index ++;
            System.out.println(" Spróbuj ponownie ");
            wyniki(new Scanner(System.in));
        }

        return index;
    }
}

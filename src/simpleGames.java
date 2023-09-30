import java.util.Random;
import java.util.Scanner;

public class simpleGames {
    public class zgadnijLiczbe {

        public static void main(String[] args) {

            Random liczba = new Random();
            int index = 0;
            int los = liczba.nextInt(10);
            int odp = -1;

            try {

                System.out.println("zgadnij liczbę od zera od 10");
                Scanner scanner = new Scanner(System.in);

                do {

                    index++;
                    System.out.println("podaj liczbę");
                    odp = scanner.nextInt();

                    if (odp > los) {
                        System.out.println("wylosowana liczba jest mniejsza od twojej");
                    } else if (odp < los) {
                        System.out.println("wylosowana liczba jest wieksza od twojej");

                    }
                }

                while (odp != los);
                System.out.println(" brawo odgadleś za " + index + " razem ");

            } catch (Exception e) {
                System.out.println("musisz podac liczbe");


            }
        }
    }
}


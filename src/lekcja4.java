

import java.util.Random;
import java.util.Scanner;

public class lekcja4 {

    public static void main(String[] args)  {

        int index=0;
        int wynik=-1;
        int los ;
        Random generate = new Random();
        los = generate.nextInt(10);

        Scanner outs = new Scanner(System.in);

         do {

            index++;
            System.out.println("podaj liczbę");
            wynik = outs.nextInt();

            if (wynik>los) {
                System.out.println("wylosowana liczba jest mniejsza od twojej");
            }

            else if (wynik<los) {
                System.out.println("wylosowana liczba jest wieksza od twojej");
            }

            }  while (wynik!=los);
             System.out.println(" brawo odgadleś za " + index + " razem ");

           }
       }


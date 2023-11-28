package simpleGames;

import java.util.Scanner;

public class main extends aplikacja {
       public static void main(String[] args) {
            main dane = new main();
            int c = dane.wyniki(new Scanner(System.in));
            System.out.print("odgadłeś za " + " " +  c + " razem ");
        }
    }


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
 class obliczPole {

    public static int kwadrat(int wynik) {
            int suma = ( 4 * wynik);
            return suma;
    }

    public static double prostokat(double x, double y) {
        double suma =2*x + 2* y;
        return suma;
    }

    public static void main(String[] args) {

        obliczPole oblicz = new obliczPole();

        try {

             Scanner inputs = new Scanner(System.in);

             System.out.print("oblicz d\u0142ugo\u015B\u0107 boku kwadratu aby wyliczy\u0107 jego pole : ");
             int dane = inputs.nextInt();
             System.out.print("obwód pola kwadratu to " + + obliczPole.kwadrat(dane) + "\n ");


             System.out.print("podaj długość boku A prostokąta: ");
             double sideLengthA = inputs.nextDouble();


             System.out.print("podaj długość boku B prostokąta: ");
             double sideLengthB = inputs.nextDouble();
             System.out.print("długość boku prostokęta A I B to " + obliczPole.prostokat(sideLengthA,sideLengthB) + "\n ");


            System.out.print("porównaj wartość A ");
            int sideLengthC = inputs.nextInt();
            System.out.print("porównaj wartość B ");
            int sideLengthL = inputs.nextInt();
            System.out.print("A I B jest " +  (sideLengthC==sideLengthL)+ "\n ");

          }

         catch (InputMismatchException e) {
               System.out.print("podane dane są błedne");
       }
    }
}



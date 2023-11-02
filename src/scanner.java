import java.util.Scanner;
public class scanner {

    private Scanner scanner ;

    private int switchCase(int f) {

        switch(f) {

            case 1:
                    scanner = new Scanner(System.in);

                    System.out.print("oblicz długość boku kwadratu aby wyliczyć jego obwód: ");
                    int c = scanner.nextInt();
                    int suma = (4 * c);
                    return suma;

                    case 2:

                    scanner = new Scanner(System.in);
                    System.out.print("podaj długość boku A prostokąta: ");
                    int x = scanner.nextInt();

                    System.out.print("podaj długość boku B prostokąta: ");
                    int y = scanner.nextInt();
                    suma =  (2 * x + 2 * y);

                    return suma;
         }
         return 0;
    }

        public static void main(String[] args)  {

            String newline = System.lineSeparator();
            System.out.println("WZORY MATEMATYCZNE:");
            System.out.println("Wybierz wzór:" + newline + "1) obwód kwadratu" + newline + "2) obwód prostakąta" );
            Scanner sca = new Scanner(System.in);

        Scanner initialize  = new Scanner(System.in);

        int y = initialize.nextInt();
        scanner wynik = new scanner();

          if (y==1) {
            System.out.println("obwód kwadratu: to " + wynik.switchCase(y));
          }

         else if (y==2) {
            System.out.println("obwód prostokąta: to " + wynik.switchCase(y));
         }

         else {
              System.out.println("bład ,nie ma takiej opcji ");

          }
    }

}

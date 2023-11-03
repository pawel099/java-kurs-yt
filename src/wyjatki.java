import java.util.Scanner;

 public class wyjatki {

 public static void main(String[] args) {

 int[] numbers = {10,11,12,13,14,15};

    System.out.println("podaj numer indeksu");
    Scanner scanner = new Scanner(System.in);

 try {

    int index = scanner.nextInt();
    System.out.println("podałeś index dla którego wartość z tablicy to " + numbers[index]);

    } catch (Exception e) {

    System.out.print(" wystapił bład " + e.getMessage());

       }
         finally {
         scanner.close();
         System.out.print(" Koniec programu ");

      }
    }
}

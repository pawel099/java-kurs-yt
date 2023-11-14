import java.util.Scanner;

public class metody {

    public static void main(String[] args) {
        int[] numbers = {10,11,12,13,14,15};

        dane(new Scanner(System.in),numbers);
        System.out.print("koniec");

    }
       public static void dane(Scanner scanner,int[] numbers) {
            System.out.println(" podaj numer indeksu " + "\n");

            try {

            System.out.println("podałeś index dla którego wartość z tablicy to " + numbers[scanner.nextInt()]);

        } catch (Exception e) {
            System.out.print(" wystapił bład " + e.getMessage()+ "\n");
            dane(new Scanner(System.in),numbers);

        }

      }

 }


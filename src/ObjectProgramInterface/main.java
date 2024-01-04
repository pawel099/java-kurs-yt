package ObjectProgramInterface;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        animals  zwierzaki  =  new zwierzaki();
        animals  zwierzaki2 =  new zwierzaki2();

        animals[] lista = {zwierzaki,zwierzaki2};

        Scanner output = new Scanner(System.in);
        String dane = output.nextLine();

        for (int index = 0; index < lista.length; index++) {

            switch (dane) {

                case "bird":
                     System.out.println(lista[index].bird());
                     break;
                     case "cat":

                     System.out.println(lista[index].cat());
                     break;
                     case "dog":

                     System.out.println(lista[index].dog());
                         System.out.println(lista[index].getDog());
                     break;
            }
        }
    }
}
import java.util.Scanner;

public class petle_001 {

    public void listaUzytkownikow() {

        String[][] lista = {

                {"anna"," - pracownik biurowy "},
                {"michal"," - Starszy Programista" },
                {"piotr", " - kierownik działu"},
                {"janek" , " - HR"},
                {"regina"," - młodszy programista"},
          };

        Scanner F = new Scanner(System.in);
        System.out.println("wyswietl liczbę elementów listy : ");
        int imie = F.nextInt();

        for (int loop_lista=0;loop_lista<imie;loop_lista++) {
            for (int loop_w = 0; loop_w <lista[loop_lista].length; loop_w++) {
                System.out.print(lista[loop_lista][loop_w] + " ");
                System.out.println();

            }
        }
    }

    public void choinka() {

        Scanner scanner = new Scanner(System.in);
        int dane = scanner.nextInt();

        for (int index = 0; index < dane; index++) {
            for (int i = 0; i <= index; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
     }


    public static void main(String[] args) {
       petle_001 dane = new petle_001();
        dane.listaUzytkownikow();
       // dane.choinka();
    }
}

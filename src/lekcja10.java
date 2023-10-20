
public class lekcja10 {

           private String tabliczkaMnozenia() {
               int[][] liczba = new int[10][10];

            String wynik = "wynik mnożenia  ";

            for (int i = 1; i < liczba.length; i++) {
                 for (int j = 1; j < liczba.length; j++) {

                    int suma =  i * j  ;
                    liczba[i][j]=suma+1;
                    System.out.print(liczba[i][j] + " ");
                }
                    System.out.println(" ");
            }

           return wynik;
        }

    public static void main(String[] args) {

        lekcja10 g = new lekcja10();
        System.out.println(g.tabliczkaMnozenia());
    }
}





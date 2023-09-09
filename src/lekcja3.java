

/* tablice zadanie wyswietl dane z tablicy za pomocą 3 róznych pętli */

public class lekcja3 {

    private void loopinfor() {

        int index = 0;

        int[] tabelka = new int[5];

        tabelka[0] = 1;
        tabelka[1] = 2;
        tabelka[2] = 3;
        tabelka[3] = 4;
        tabelka[4] = 5;


        for (index=0;index<tabelka.length;index++) {
            System.out.println(tabelka[index]);

        }
     }

    private void wynik() {

     int index = 0;

     int[] tabelka ={1,2,3,4};

     do {
         index++;
         System.out.println(tabelka[index]);

     } while (index<tabelka.length-1);
   }

    public static void main(String[] args){
        /*
         int[] tabelka = new int[5];

         tabelka[0] = 1;
         tabelka[1] = 2;
         tabelka[2] = 3;
         tabelka[3] = 4;
         tabelka[4] = 5;

         int i = 0;

         while (i< tabelka.length - 1) {
             System.out.println(tabelka[i]);
             i++;
         }
 */
       lekcja3 dane = new lekcja3();
       dane.wynik();

 }

 }

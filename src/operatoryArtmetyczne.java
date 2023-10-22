public class operatoryArtmetyczne {
    /* operatory artmetyczne  */
    // operatory artmetyczne + - % * /
    // operatory porównania == równy , =! rózny , < mniejszy , > wiekszy
    // operatory logiczne && and || OR

    public static void main(String[] args) {




         int index = 0;
         while (index<10) {

             if (index % 2 == 0 && index != 0) {
                System.out.println(index);
             }

            index++;
        }

            int l1 = 1;
            int l2 = 1 ;


            int suma = l1 + l2;

            try {

                System.out.println(suma/0);

            }  catch(ArithmeticException e) {

                System.out.println("mała cholero nie dziel przez zero");
            }


            int i=0;

            int inkrementacja=100;

             while (i<10) {

                 if (i!=0) {

                    int x = inkrementacja-index;
                    System.out.println(x);
                }

                i++;
            }
         }
     }





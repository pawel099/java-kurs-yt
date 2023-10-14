public class lekcja9 {

    public static void main(String[] args) {

        /* int[][] table = new int[10][10];

        for (int i=0; i<table.length;i++) {

            for (int j =0; j<table[0].length;j++) {

                table[0][9]=1;
                table[0][9]=2;
                table[0][9]=3;


                System.out.print(table[i][j] + " ");
            }
            System.out.println("");

        }
  */

        int[][]tablica = new int[10][10];

        for(int i = 0; i<10; i ++)
        {

            for (int j = 0; j < 10; j++) {
                    tablica[i][j] = i * j +1;
                }
            }

        for(int j = 1; j <10; j++)
        {
            for(int i = 0; i <10; i++)
            {

                System.out.print(tablica[i][j] + " ");
            }

            System.out.println("");
        }



    }

}


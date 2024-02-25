public class program {
    public int int_num_value=0;

    protected int wynik() {

        int[] tablica_elementow = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int index = 0; index < tablica_elementow.length; index++) {

            if (index % 2 == 0) {
                int x = index * tablica_elementow[index];
                System.out.println(tablica_elementow[index]);
                this.int_num_value = x;
            }
        }
        return this.int_num_value ;
    }
    public static void main(String[] args) {

      program e = new program();
      System.out.println(e.wynik());

    }
 }

import java.util.*;
public class obiekty extends aplikacja {
    public static void main(String[] args) {

        obiekty dane = new obiekty();
        int c = dane.wyniki(new Scanner(System.in));
        System.out.print("odgadłeś za " + " " +  c + " razem ");


    }
}

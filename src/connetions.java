import javax.swing.*;

public class connetions implements connection,views {

    public static void lista() {

        String polacz = connect;
        String user = name;
        String passwords = password;
        String dane = baza;
        JFrame frames = frame;

       Object[] lista = {
               polacz,

       };

       for (Object lists : lista ) {
            System.out.println(lists);


        }
    }
}

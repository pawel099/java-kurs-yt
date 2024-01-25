import javax.swing.*;

public class conects implements conection ,views {

    public static void lista() {

        String polacz = connect;
        String user = name;
        String passwords = password;
        String dane = baza;
        JFrame frames = frame;

       Object[] lista = {
               polacz,
               frames
       };

       for (Object lists : lista ) {
            System.out.println(lists);
            frames.setSize(400,400);
            frames.setVisible(true);

        }
    }
}

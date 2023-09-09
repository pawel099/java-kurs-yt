
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
/* zadanie zgadnij imię po wpisaniu tekstu w konsoli + rozwiązanie */

public class lekcja5 extends JFrame {
    protected JFrame frame;
    protected JOptionPane optionPane;

    private void frames() {

      frame = new JFrame() ;
      frame.setTitle("podaj imię");
      frame.setSize(500,300);
    }
    private void showMessage() {

        Scanner outs = new Scanner(System.in);
        String wynik = outs.nextLine();


        switch (wynik) {

            case "pawel":

                  JOptionPane.showMessageDialog(frame,"hello pawel");

                   break;

                   case "andrzej":
                       JOptionPane.showMessageDialog(frame, "hello andriu");
                   break;

                   case "anna":
                       JOptionPane.showMessageDialog(frame, "hello anna");
                   break;

                   case "michal":
                       JOptionPane.showMessageDialog(frame, "hello michal");

                   break;

                   default: System.out.println("niestety nie zgadłeś , spróbuj ponownie");
        }
    }

    public static void main (String[] args) {

        lekcja5 dane = new lekcja5();
        dane.frames();
        dane.showMessage();

    }
 }

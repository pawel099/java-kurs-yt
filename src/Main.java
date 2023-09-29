import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main extends JFrame {

    private void frame() {

        setTitle("przegładarka zdjęć z java");
        setSize(500, 600);
        setVisible(true);
        setLayout(new GridLayout(3, 1));


    }

    public static void main(String[] args) {

            Main x = new Main();
            x.frame();

        }
    }